# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table producto (
  id                            bigint auto_increment not null,
  tamanno                       integer,
  precion_unidad                integer,
  tipo                          varchar(255),
  cantidad                      integer,
  constraint pk_producto primary key (id)
);

create table usuario_empresa (
  id                            bigint auto_increment not null,
  usuario                       varchar(255),
  constraint pk_usuario_empresa primary key (id)
);


# --- !Downs

drop table if exists producto;

drop table if exists usuario_empresa;

