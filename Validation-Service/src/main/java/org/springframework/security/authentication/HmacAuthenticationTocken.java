package org.springframework.security.authentication;

// Deprecated shim for backward compatibility with the misspelled class name
@Deprecated
public class HmacAuthenticationTocken extends HmacAuthenticationToken {

    private static final long serialVersionUID = 620L;

    public HmacAuthenticationTocken(Object principal, Object credentials) {
        super(principal, credentials);
    }

}