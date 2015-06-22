CREATE TABLE GEEK
(
    idGeek INT PRIMARY KEY NOT NULL,
    nom VARCHAR(100),
    prenom VARCHAR(100),
    email VARCHAR(255),
    dateNaissance DATE,
    ville VARCHAR(255),
    sexe VARCHAR(1),
	centreInteret VARCHAR(255)
)

CREATE TABLE CONSULTATION
(
    idConsultation INT PRIMARY KEY NOT NULL,
    compteur INT,
	adresseIP VARCHAR(15),
	idGeek INT
)

ALTER TABLE CONSULTATION
ADD CONSTRAINT FK_ConsultationGeek
FOREIGN KEY (idGeek)
REFERENCES GEEK(idGeek)