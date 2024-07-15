package com.navasan.forohub.controller;

import com.navasan.forohub.domain.topico.AgregarTopicoService;
import com.navasan.forohub.domain.topico.DatosAgregarTopico;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
public class TopicoController {
    @Autowired
    private AgregarTopicoService topicoService;

    @PostMapping
    @Transactional
    public ResponseEntity agregar(@RequestBody @Valid DatosAgregarTopico datos){
        var response = topicoService.agregar(datos);
        return ResponseEntity.ok(response);
    }
}
