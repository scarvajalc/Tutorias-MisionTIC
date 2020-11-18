CREATE SCHEMA aerolineag3m2;
USE aerolineag3m2;

DROP TABLE avion;

CREATE TABLE avion(
	numero_registro_unico INT PRIMARY KEY,
    modelo VARCHAR(30) NOT NULL,
    capacidad INT
);

DROP TABLE aeropuerto;
CREATE TABLE aeropuerto(
	codigo_aeropuerto VARCHAR(4) PRIMARY KEY,
    nombre_aeropuerto VARCHAR(30) NOT NULL
);

CREATE TABLE vuelo(
	numero_vuelo INT PRIMARY KEY,
    codigo_aeropuerto_salida VARCHAR(4) NOT NULL,
    codigo_aeropuerto_llegada VARCHAR(4) NOT NULL,
    fecha_hora_salida TIMESTAMP NOT NULL,
    fecha_hora_llegada TIMESTAMP NOT NULL,
    avion_numero_registro_unico INT,
    FOREIGN KEY (avion_numero_registro_unico) REFERENCES avion(numero_registro_unico),
    FOREIGN KEY (codigo_aeropuerto_salida) REFERENCES aeropuerto(codigo_aeropuerto),
    FOREIGN KEY (codigo_aeropuerto_llegada) REFERENCES aeropuerto(codigo_aeropuerto)
);

ALTER TABLE avion MODIFY modelo VARCHAR(30) NOT NULL;

INSERT INTO avion VALUES (12345, "BOEING747", 90);

INSERT INTO avion (numero_registro_unico, capacidad) VALUES (22222, 100);

SELECT * FROM avion;

UPDATE avion
SET modelo = "AIRBUSMAX"
WHERE numero_registro_unico = 22222;

