-- creation de la database --

CREATE DATABASE IF NOT EXISTS ProjetDevJava  DEFAULT CHARACTER SET utf8mb4;

use ProjetDevJava;

-- creation de la table clients --

CREATE TABLE IF NOT EXISTS customer (
id INT NOT NULL AUTO_INCREMENT,
nomSociete VARCHAR(30),
photo VARCHAR(30),
nom VARCHAR(30) NOT NULL,
prenom VARCHAR(30) NOT NULL,
adresse VARCHAR(120),
codePostal INT(6),
ville VARCHAR(30),
numeroTel INT NOT NULL,
email VARCHAR(50),
etatCustomer CHAR(1),
dateContact DATETIME NOT NULL,
commentaire TINYTEXT,
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci; 