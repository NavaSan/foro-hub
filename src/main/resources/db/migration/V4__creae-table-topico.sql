create table topico(
    id bigint not null auto_increment,
    titulo varchar(25) not null,
    mensaje varchar(250) not null,
    fecha datetime not null,
    autor bigint not null,
    curso bigint not null,
    respuesta bigint not null,

    primary key(id),
    constraint fk_topico_autor foreign key (autor) references usuario(id),
    constraint fk_topico_curso foreign key (curso) references curso(id)
   -- constraint fk_topico_respuesta foreign key (respuesta) references respuesta(id)
);