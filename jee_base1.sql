-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  Dim 20 jan. 2019 à 19:03
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `jee_base1`
--

-- --------------------------------------------------------

--
-- Structure de la table `categories`
--

DROP TABLE IF EXISTS `categories`;
CREATE TABLE IF NOT EXISTS `categories` (
  `Code_Categorie` int(3) NOT NULL AUTO_INCREMENT,
  `Type_Categorie` varchar(50) NOT NULL,
  `Description_Categorie` varchar(100) NOT NULL,
  PRIMARY KEY (`Code_Categorie`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categories`
--

INSERT INTO `categories` (`Code_Categorie`, `Type_Categorie`, `Description_Categorie`) VALUES
(1, 'Processeur', 'Composant de traitement'),
(2, 'Ram', 'responsable a la rapidité'),
(3, 'Disque Dure', 'Responsable au Stockage'),
(4, 'CarteMere', 'MotherBoard'),
(5, 'CarteSon', 'SonorBoard');

-- --------------------------------------------------------

--
-- Structure de la table `composants`
--

DROP TABLE IF EXISTS `composants`;
CREATE TABLE IF NOT EXISTS `composants` (
  `codeComposant` int(11) NOT NULL AUTO_INCREMENT,
  `nomComposant` varchar(45) DEFAULT NULL,
  `descriptionComposant` varchar(45) DEFAULT NULL,
  `dependencyComposant` varchar(45) DEFAULT NULL,
  `Code_catégorie` int(3) NOT NULL,
  PRIMARY KEY (`codeComposant`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `composants`
--

INSERT INTO `composants` (`codeComposant`, `nomComposant`, `descriptionComposant`, `dependencyComposant`, `Code_catégorie`) VALUES
(1, 'ProcesseurIntel', '4.4GHZ', 'i7', 1),
(2, 'ProcesseurAMD', '4.8GHZ', 'i7', 1),
(3, 'RamDDR3', '4', '8GB', 2),
(5, 'RamDDR2', '8GHZ', '4GB', 2),
(6, 'RamDDR4', '4GHZ', '4GB', 2);

-- --------------------------------------------------------

--
-- Structure de la table `logiciels`
--

DROP TABLE IF EXISTS `logiciels`;
CREATE TABLE IF NOT EXISTS `logiciels` (
  `codLogiciel` int(11) NOT NULL AUTO_INCREMENT,
  `nomLogiciel` varchar(45) DEFAULT NULL,
  `Taille` varchar(15) DEFAULT NULL,
  `DescriptionLogiciel` varchar(45) DEFAULT NULL,
  `Dependences` varchar(200) NOT NULL,
  PRIMARY KEY (`codLogiciel`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `logiciels`
--

INSERT INTO `logiciels` (`codLogiciel`, `nomLogiciel`, `Taille`, `DescriptionLogiciel`, `Dependences`) VALUES
(1, 'Visual Studio', '45GB', 'Framework', 'Composant:Processeur:i7,Composant:Disque Dure:45GB'),
(2, 'Android Studio', '800MB', 'IDE', 'Composant:Ram:4GB'),
(3, 'Matlab 2017', '15GB', 'Traitement mathematique', 'i3,Ram2GB');

-- --------------------------------------------------------

--
-- Structure de la table `utilisateurs`
--

DROP TABLE IF EXISTS `utilisateurs`;
CREATE TABLE IF NOT EXISTS `utilisateurs` (
  `codeUser` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) DEFAULT NULL,
  `prenom` varchar(45) DEFAULT NULL,
  `Date_naissance` varchar(30) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `sexe` varchar(15) DEFAULT NULL,
  `login` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codeUser`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `utilisateurs`
--

INSERT INTO `utilisateurs` (`codeUser`, `nom`, `prenom`, `Date_naissance`, `email`, `sexe`, `login`, `password`) VALUES
(1, 'fahed', 'elourajini', NULL, 'fahed.elourajini@gmail.com', NULL, 'fahd123', 'fahd123'),
(2, 'farouk', 'elourajini', NULL, 'farouk.elourajini@gmail.com', NULL, 'farouk123', 'farouk123'),
(3, 'fares', 'fares', '21/06/1995', 'fares@gmail.com', 'Homme', 'fares', 'fares123'),
(4, 'fares', 'fares', '21/06/1995', 'fares@gmail.com', 'Homme', 'fares', 'fares123'),
(5, 'fares', 'fares', '21/06/1995', 'fares@gmail.com', 'Homme', 'fares', 'fares123'),
(6, 'ElourajiniFahed', 'ElourajiniFahed', '2019-01-17', 'ouraginifahd1995@hotmail.com', 'homme', 'ElourajiniFahed', '123'),
(7, 'Mounira', 'Mounira', '2019-01-17', 'mounira1995@hotmail.com', 'femme', 'Mounira', 'mounira123'),
(8, 'hedi', 'hedi', '2019-01-16', 'hedi@gmail.com', 'homme', 'hedi', 'hedi123'),
(9, 'Mouahmed', 'Bin Aziza', '19/01/2019', 'benaziza@gmail.com', 'Homme', '123', '123'),
(10, 'Motez', 'Abdelhamid', '19/01/2019', 'motez@gmail.com', 'Homme', '123', '123'),
(11, 'Haifa', 'Ayechi', '19/01/2019', 'haifa@gmail.com', 'Femme', '123', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
