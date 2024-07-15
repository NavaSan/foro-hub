package com.navasan.forohub.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.navasan.forohub.domain.usuario.Usuario;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TokenService {
    private String apiSecret = "123456";

//    public String generarToken(Usuario usuario){
//        try{
//            Algorithm algorithm = Algorithm.HMAC256(apiSecret);
//            return JWT.create()
//                    .withIssuer("foro hub")
//                    .withSubject(usuario.getNombre())
//                    .withClaim("id", usuario.getId())
//                    .withExpiresAt(generarFechaExpirecion())
//                    .sign(algorithm);
//        }catch (JWTCreationException exception){
//            throw new RuntimeException();
//        }
//    }
//
//    public String getSubject(String token){
//        String subject = null;
//        try {
//            Algorithm algorithm = Algorithm.HMAC256(apiSecret);
//            DecodedJWT verifier = JWT.require(algorithm)
//                    .withIssuer("foro hub")
//                    .build()
//                    .verify(token);
//            subject = verifier.getSubject();
//        } catch (JWTVerificationException exception) {
//            // Invalid signature/claims
//            throw new RuntimeException("verifier invalido", exception);
//        }
//        if (subject == null) {
//            throw new RuntimeException("verifier invalido");
//        }
//        return subject;
//    }

    private Instant generarFechaExpirecion() {
        return null;
    }
}
