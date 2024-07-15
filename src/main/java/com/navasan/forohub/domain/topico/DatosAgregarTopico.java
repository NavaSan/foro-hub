package com.navasan.forohub.domain.topico;

import com.navasan.forohub.domain.curso.Curso;
import com.navasan.forohub.domain.respuesta.Respuesta;
import com.navasan.forohub.domain.usuario.Usuario;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosAgregarTopico(@NotNull Long id, @NotNull String titulo, @NotNull String mensaje, @NotNull
                                 LocalDateTime fechaCreacion, @NotNull Usuario autor, @NotNull Curso curso, @NotNull
                                 Respuesta respuesta) {
}
