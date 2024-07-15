package com.navasan.forohub.domain.topico;

import com.navasan.forohub.domain.curso.Curso;
import com.navasan.forohub.domain.respuesta.Respuesta;
import com.navasan.forohub.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosDetalleTopico(Long id, String titulo, String mensaje, LocalDateTime fechaCreacion,
                                 Boolean status, Usuario autor,
                                 Curso curso,
                                 Respuesta respuesta) {
    public DatosDetalleTopico(Topico topico) {
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFechaCreacion(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespuesta());
    }
}
