package com.navasan.forohub.domain.topico;

import com.navasan.forohub.domain.curso.Curso;
import com.navasan.forohub.domain.respuesta.Respuesta;
import com.navasan.forohub.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    private Boolean status;
    private Usuario autor;
    private Curso curso;
    private Respuesta respuesta;

    public Topico(DatosAgregarTopico datos) {
        this.status = true;
    }
}
