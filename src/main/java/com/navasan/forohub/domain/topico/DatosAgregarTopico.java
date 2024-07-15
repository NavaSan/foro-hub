package com.navasan.forohub.domain.topico;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DatosAgregarTopico(Long id, @NotNull String titulo, @NotNull String mensaje, @NotNull LocalDateTime fecha, @NotNull Autor autor, @NotNull Curso curso, @NotNull Respuesta respuesta) {
}
