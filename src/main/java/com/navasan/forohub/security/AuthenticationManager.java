package com.navasan.forohub.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public interface AuthenticationManager {
    Authentication autenticate(Authentication authentication) throws AuthenticationException;
}
