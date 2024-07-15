package com.navasan.forohub.domain.topico;

import java.time.LocalDateTime;

public enum DatosDetalleTopico(Long id, String titulo, String mensaje, LocalDateTime fecha, Long autor, Long curso, Long respuesta) {
    public DatosDetalleTopico(Topico topico){
        this()
    }
}
