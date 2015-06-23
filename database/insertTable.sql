INSERT INTO GEEK (idGeek, nom, prenom, email, dateNaissance, ville, sexe) VALUES
(1, 'DUCROT', 'Lauriane', 'lauriane.ducrot@gmail.com', 'LISSIEU', 'F'),
(2, 'ESCURE', 'Philippe', 'philippe.escure@gmail.com', 'LYON', 'M'),
(3, 'MONET', 'Marine', 'monet.marine@gmail.com', 'ST MOLF', 'F');

INSERT INTO CENTREINTERET (idCentreInteret, libelle) VALUES
(1, 'CINEMA'),
(2, 'SPORT'),
(3, 'PROGRAMMATION'),
(4, 'CULTURE MARINE'),
(5, 'ANIMAUX'),
(6, 'NOUVELLES TECHNOLOGIE'),
(7, 'MUSIQUE'),
(8, 'ART');

INSERT INTO LIEN_GEEK_CI (idGeek, idCentreInteret) VALUES
(1, 1),
(1, 7),
(1, 6),
(2, 3),
(2, 5),
(3, 4),
(3, 5),
(3, 8);