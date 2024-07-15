create table respuesta(
    id bigint not null auto_increment,
    mensaje varchar(250) not null,
    topico bigint not null,
    fecha_creacion datetime not null,
    autor bigint not null,
    solucion varchar(250) not null,

    primary key(id),
    constraint fk_respuesta_autor foreign key (autor) references usuario(id)
   -- constraint fk_respuesta_topico foreign key (topico) references topico(id)

 );