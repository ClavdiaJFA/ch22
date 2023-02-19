-- Usar la base de datos banco
USE banco;
-- Mostrar la estructura de la tabla 
DESCRIBE clientes;
-- Mostrar todos los datos de la tabla clientes
SELECT * FROM clientes;
-- Agregar un cliente
INSERT INTO clientes (idclientes, nombre, apellido, email)
   VALUES (1, 'Pax', 'Betancourt', 'pax@miamigo.com');
   
INSERT INTO clientes (idclientes, nombre, apellido, email)
   VALUES (2, 'Juan', 'Herrera', 'juan@miotroamigo.com');
   
INSERT INTO clientes( nombre, apellido, email)
	VALUES ('Adrián', 'González', 'adrian@mimejoramigo.com'),
    ('Fer', 'Rosales', 'fer@mimejoramigo.com'),
    ('Alan', 'Ramos', 'alan@mimejoramigo.com');

INSERT INTO clientes( nombre, apellido, email)
	VALUES ('Juan', 'Herrera', 'juanfalso@desconocido.com');
