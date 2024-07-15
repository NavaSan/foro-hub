package com.navasan.forohub.domain.topico;

public class AgregarTopicoService {
    public DatosDetalleTopico agregar(DatosAgregarTopico datos){
        var topico = new Topico(datos);

        return new DatosDetalleTopico(topico);
    }
}
