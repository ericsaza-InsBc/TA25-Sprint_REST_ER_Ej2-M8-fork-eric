DROP TABLE IF EXISTS `videos`;
DROP table IF EXISTS cliente;

create table DEPARTAMENTOS(
PK_CODIGO int,
NOMBRE varchar(100),
PRESUPUESTO int,
primary key (PK_CODIGO)
);

create table EMPLEADOS(
DNI varchar(8),
NOMBRE varchar(100),
APELLIDOS varchar(255),
DEPARTAMENTO int,
primary key (DNI),
foreign key (DEPARTAMENTO) references DEPARTAMENTOS(PK_CODIGO)
);

