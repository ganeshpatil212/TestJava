package com.myproj.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum ErrorCodeEnum {
    
    // Generic errors
	duggu(11001, "invalid payment method currenly we are supporing only for paypal"),
	INVALID_HMAC_SIGNATURE(12001, "Invalid HMAC signature");
//    INTERNAL_SERVER_ERROR(ERR-500, "An unexpected error occurred"),
//    INVALID_REQUEST(ERR-400, "Invalid request payload"),
//    MISSING_FIELD(ERR-401, "Required field is missing"),
//    UNAUTHORIZED(ERR-403, "Unauthorized request"),
//
//    // Payment-related
//    PAYMENT_VALIDATION_FAILED(PAY-001, "Payment validation failed"),
//    INVALID_HMAC(PAY-002, "Invalid HMAC signature"),
//    PAYMENT_PROVIDER_ERROR(PAY-003, "Payment provider failure"),
//
//    // JSON / Parsing
//    JSON_READ_ERROR(JSON-001, "Unable to read request body"),
//    JSON_PARSE_ERROR(JSON-002, "Invalid JSON structure");

    private final int errorCode;
    private final String message;

    ErrorCodeEnum(int code, String message) {
        this.errorCode = code;
        this.message = message;
    }
   
    
}

