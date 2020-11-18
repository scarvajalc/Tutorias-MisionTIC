USE universidad;

SELECT * FROM grado WHERE id = 12;

INSERT INTO grado VALUES (11, 'Grado en Musica (Plan 2019)');
INSERT INTO grado VALUES (12, 'Grado en Algebra (Plan 2019)');
INSERT INTO grado (nombre) VALUES ("Grado en Cocina (Plan 2003)");

DELETE FROM grado WHERE id = 12;


SELECT * FROM asignatura;
#Basica 1 credito
#Optativa 2 creditos
#Obligatoria 3 creditos

UPDATE asignatura 
SET id_grado = 11 
WHERE id = 1;


UPDATE asignatura 
SET creditos = 1 
WHERE tipo = 'básica';

UPDATE asignatura 
SET creditos = 2 
WHERE tipo = 'optativa';

UPDATE asignatura 
SET creditos = 3 
WHERE tipo = 'obligatoria';

SELECT DISTINCT tipo from asignatura;


SELECT * FROM asignatura ORDER BY creditos DESC;

SELECT SUM(creditos) FROM asignatura;

SELECT tipo FROM asignatura GROUP BY tipo;

SELECT DISTINCT tipo FROM asignatura;



