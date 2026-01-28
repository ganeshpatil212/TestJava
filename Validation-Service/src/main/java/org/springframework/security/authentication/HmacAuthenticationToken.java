package org.springframework.security.authentication;

import java.util.Collections;

public class HmacAuthenticationToken extends AbstractAuthenticationToken {

    private final Object principal;
    private final Object credentials;

    // Unauthenticated constructor
    public HmacAuthenticationToken(Object principal, Object credentials) {
        super(Collections.emptyList());  // <-- fixed
        this.principal = principal;
        this.credentials = credentials;
        setAuthenticated(true);
    }

    @Override
    public Object getCredentials() {
        return credentials;
    }

    @Override
    public Object getPrincipal() {
        return principal;
    }
}

