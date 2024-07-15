create table usuario(
    id bigint not null auto_increment,
    nombre varchar(100) not null,
    correo_electonico varchar(50) not null,
    contrasena varchar(250) not null,
    perfil bigint not null,

    primary key(id),
    constraint fk_usuario_perfil foreign key (perfil) references perfil(id)
);