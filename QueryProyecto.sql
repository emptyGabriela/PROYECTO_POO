USE PROYECTO

CREATE TABLE Jugador(
id_jugador INT NOT NULL,
nickname VARCHAR(25) NOT NULL,
PRIMARY KEY(id_jugador)
);
GO

CREATE TABLE Juego(
id_juego INT NOT NULL,
fecha_hora_inicio DATETIME NOT NULL,
fecha_hora_fin DATETIME NOT NULL,
PRIMARY KEY(id_juego)
);
GO


CREATE TABLE Partida(
id_jugador INT NOT NULL,
id_juego INT NOT NULL,
tiros_dado INT NOT NULL,
retrocesos INT NOT NULL,
desbancamientos INT NOT NULL,
ganador VARCHAR(25) NOT NULL
);
GO

ALTER TABLE Partida ADD CONSTRAINT pk_partida PRIMARY KEY (id_juego,id_jugador);
ALTER TABLE Partida ADD CONSTRAINT fk_id_jugador FOREIGN KEY (id_jugador) REFERENCES Jugador;
ALTER TABLE Partida ADD CONSTRAINT fk_id_juego FOREIGN KEY (id_juego) REFERENCES Juego;

INSERT INTO Jugador(id_jugador,nickname)
	 VALUES(1,'Vegeta777');

INSERT INTO Juego(id_juego,fecha_hora_inicio,fecha_hora_fin)
	VALUES (1,'2023-05-17 10:30:00','2023-05-17 10:59:00');

INSERT INTO Partida(id_jugador,id_juego,tiros_dado,retrocesos,desbancamientos,ganador)
	VALUES (1,1,10,3,2,'Vegeta777')

SELECT * FROM Jugador;
SELECT * FROM juego;
SELECT * FROM Partida;