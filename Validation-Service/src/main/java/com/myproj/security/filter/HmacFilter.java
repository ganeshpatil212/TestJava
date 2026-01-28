package com.myproj.security.filter;

import java.io.BufferedReader;
import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.HmacAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.myproj.exception.CustomException;
import com.myproj.exception.ErrorCodeEnum;
import com.myproj.service.HmacSha256Serviceimpl;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class HmacFilter extends OncePerRequestFilter {

	private HmacSha256Serviceimpl hmacSha256Serviceimpl;
	private Gson gson;
	
	HmacFilter(HmacSha256Serviceimpl hmacSha256Serviceimpl, Gson gson){
		this.hmacSha256Serviceimpl=hmacSha256Serviceimpl;
		this.gson=gson;
	}
	
	private final String secretKey = "mySecretKey123"; // keep this in properties

	@Override
	protected void doFilterInternal(HttpServletRequest request,
			HttpServletResponse response,
			FilterChain filterChain)
					throws ServletException, IOException {
		
		String hmacSignature = request.getHeader("X-HMAC-SIGNATURE");
		if (hmacSignature == null || hmacSignature.isEmpty()) {
			System.out.println("Missing HMAC signature not found in the request headers.");
			throw new CustomException(ErrorCodeEnum.INVALID_HMAC_SIGNATURE.getErrorCode(),
					"Missing HMAC signature", HttpStatus.BAD_REQUEST);
		}

		try {        
			CachedBodyHttpServletRequest cachedRequest =
	                new CachedBodyHttpServletRequest((HttpServletRequest) request);			
			StringBuilder sb = new StringBuilder();
			BufferedReader reader = cachedRequest.getReader();
			String line;
			while ((line = reader.readLine()) != null) {
			    sb.append(line);
			}
			String jsonBody = sb.toString();


			String uri = request.getRequestURI();
			String compactJson = "";
			// Minify JSON only if body is not empty
			if (jsonBody != null && !jsonBody.trim().isEmpty()) {
			    try {
			        JsonElement element = JsonParser.parseString(jsonBody);
			        compactJson = new Gson().toJson(element);
			    } catch (Exception e) {
			        compactJson = jsonBody.trim();
			    }
			}

			// Generate final HMAC data
			String dataToSign = compactJson.isBlank() ? uri : uri + compactJson;

			System.out.println("Compact JSON Body: " + compactJson);
			System.out.println("Data used for HMAC: " + dataToSign);
		
			
			System.out.println("Received HMAC Signature: " + hmacSignature);
			
			boolean isValid= hmacSha256Serviceimpl.validateHmacSha256(dataToSign, hmacSignature);

			if (isValid) {
				System.out.println("HMAC is valid, proceeding with the request.");
				HmacAuthenticationToken auth =
						new HmacAuthenticationToken("user", "");

				SecurityContextHolder.getContext().setAuthentication(auth);
				filterChain.doFilter(cachedRequest, response);      
			}
			else {
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				response.getWriter().write("from111  Invalid HMAC signature");				
			
			}


		} catch (Exception e) {
			System.out.println("HMAC validation failed: " + e.getMessage());
			response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
			response.getWriter().write("Error validating HMAC: " + e.getMessage());
		}
	}
}
