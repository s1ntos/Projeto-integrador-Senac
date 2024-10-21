use atv3uupi;

CREATE TABLE Filme (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,,
    titulo VARCHAR(255) NOT NULL,
    sinopse TEXT NOT NULL,,
    genero VARCHAR(50) NOT NULL,,
    anoLancamento INT
);

CREATE TABLE Analise (
    id INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
    filme_id INT NOT NULL,
    analise TEXT NOT NULL,
    nota INT NOT NULL,
    FOREIGN KEY (filme_id) REFERENCES Filme(id)
);