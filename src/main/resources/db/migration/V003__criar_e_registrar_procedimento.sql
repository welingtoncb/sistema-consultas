CREATE TABLE procedimento (
	id INT NOT NULL AUTO_INCREMENT, 
	nome VARCHAR(50) NOT NULL, PRIMARY KEY (id) 
) ENGINE=INNODB CHARSET=utf8;

INSERT INTO procedimento (nome) VALUES ('Exame clínico');
INSERT INTO procedimento (nome) VALUES ('Consulta');
INSERT INTO procedimento (nome) VALUES ('Internação');
INSERT INTO procedimento (nome) VALUES ('Exame simples');
INSERT INTO procedimento (nome) VALUES ('Exame complexo');
INSERT INTO procedimento (nome) VALUES ('Cirurgia');