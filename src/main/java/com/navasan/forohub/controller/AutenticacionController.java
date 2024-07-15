package com.navasan.forohub.controller;

//import com.navasan.forohub.domain.usuario.AutenticarUsuario;
import com.navasan.forohub.domain.usuario.Usuario;
import com.navasan.forohub.security.AuthenticationManager;
import com.navasan.forohub.security.DatosJWTToken;
import com.navasan.forohub.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class AutenticacionController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private TokenService tokenService;

//    @PostMapping
//    public ResponseEntity autenticarUsuario(@RequestBody @Valid AutenticarUsuario datos){
//        Authentication authenticationToken = new UsernamePasswordAuthenticationToken(datos.nombre(), datos.contrasena());
//
//        var usuarioAutenticado = authenticationManager.autenticate(authenticationToken);
//        var JWTtoken = tokenService.generarToken((Usuario) usuarioAutenticado.getPrincipal());
//
//        return ResponseEntity.ok(new DatosJWTToken(JWTtoken));
//    }
}
