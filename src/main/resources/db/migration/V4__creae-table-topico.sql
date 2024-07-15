create table topicos(
    id bigint not null auto_increment,
    titulo varchar(25) not null,
    mensaje varchar(250) not null,
    fecha datetime not null,
    autor bigint not null,
    curso bigint not null,
    respuesta bigint not null,

    primary key(id),
    constraint fk_topico_autor foreign key (autor) references usuarios(id),
    constraint fk_topico_curso foreign key (curso) references cursos(id)
   -- constraint fk_topico_respuesta foreign key (respuesta) references respuesta(id)
);