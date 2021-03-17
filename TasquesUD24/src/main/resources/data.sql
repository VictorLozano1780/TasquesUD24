
DROP table IF EXISTS Empleado;

create table Empleado(
	id int auto_increment,
	nombre varchar(250),
	apellido varchar(250),
	trabajo varchar(250),
	salario int default 0,
	fecha date
);

insert into Empleado (nombre, apellido,fecha)values('Jose','Marin', NOW());
insert into Empleado (nombre, apellido,fecha)values('Victor','Lozabo', NOW());
insert into Empleado (nombre, apellido,fecha)values('Pepe','Martinez', NOW());
insert into Empleado (nombre, apellido,fecha)values('Luis','Cocina', NOW());
insert into Empleado (nombre, apellido,fecha)values('Maria','Lopez', NOW());
