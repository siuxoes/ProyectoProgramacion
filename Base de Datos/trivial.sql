-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 29-05-2015 a las 11:08:04
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `trivial`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE IF NOT EXISTS `preguntas` (
  `iden` int(11) NOT NULL COMMENT 'Identificador que lo relacionara con su tema.',
  `pregunta` varchar(1000) NOT NULL,
  `A` varchar(100) NOT NULL,
  `B` varchar(100) NOT NULL,
  `C` varchar(100) NOT NULL,
  `respuesta` varchar(100) NOT NULL,
  `tema` int(11) NOT NULL COMMENT 'Tema al que referencia.',
  `linkImagen` varchar(1000) DEFAULT NULL COMMENT 'Link de Imagen',
  PRIMARY KEY (`iden`),
  KEY `clav` (`tema`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Tabla que contendrá las preguntas y sus respuestas y a que tema referenciaran.';

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`iden`, `pregunta`, `A`, `B`, `C`, `respuesta`, `tema`, `linkImagen`) VALUES
(10, 'Este campeón es conocido como el Niño oscuro, tiene la capacidad de controlar el fuego, y tiene una pequeño compañero. ¿Cuál es su nombre?', 'Tristana', 'Zilean', 'Alistar', 'Annie', 1, ''),
(11, 'Este es un campeón completamente maniaco. También conocido como el bufón siniestro, llevan dos puñales. ¿Cuál es el nombre de este loco?', 'Akali', 'Corki', 'Anivia', 'Shaco', 1, ''),
(12, 'Este campeón es conocido por llevar una maza, que se conoce como el Maestro de metal,  surgió de la enfermedad y la oscuridad. ¿Cuál es el nombre?', 'Kenner', 'Heimerdinger', 'Blitzcrank', 'MordeKaiser', 1, ''),
(13, 'Este campeón es una criatura completamente diferente, y es conocida como la Boca del Abismo. ¿Qué es esto?', 'Cho''Gath', 'Blitzcrank', 'Karthus', 'Kog''Maw', 1, ''),
(14, 'Este campeón utiliza una espada, y lleva un extraño casco amarillo. Conocido como el Wuju Bladesman, ¿quién es esta persona?', 'Poppy', 'Jax', 'Nidalee', 'Master Yi', 1, ''),
(15, 'Este campeón es un ninja, literalmente. Conocido como el Ojo del Crepúsculo, ¿quién es este?', 'Sivir', 'Akali', 'Kennen', 'Shen', 1, ''),
(16, 'Este campeón es feroz, con dos espadas, y se conoce con el nombre de The Sinister Blade. ¿Quién es este?', 'Olaf', 'Nasus', 'Morgana', 'Katarina', 1, ''),
(17, 'Este campeón está cubierto de pies a cabeza en los tatuajes extraños, y es el Rogue Mago. Quién es este?', 'Galio', 'Veigar', 'Kassadin', 'Ryze', 1, ''),
(18, 'Esta Champion es un potente asesino y también se conoce como el Widowmaker. ¿Quién es este?', 'Kayle', 'Kha''Zix', 'Ezreal', 'Evelynn', 1, ''),
(19, 'Este campeón es un extraño, que también se conoce con el el Mensajero de la Muerte, y lleva una guadaña. ¿Quién es?', 'Twitch', 'Miss Fortune', 'Malphite', 'Fiddlesticks', 1, ''),
(20, '¿Quien dijo esta frase? (Solo los tontos buscan la ayuda de los desesperados)', 'Yami', 'Bakura', 'Kaiba', 'Marik', 2, ''),
(21, '¿Quién es este personaje? ', 'L', 'Ryuk', 'Near', 'Ligth', 2, '21.png'),
(22, '¿Quien dijo esta frase? (Los tontos aprenden de los errores los sabios de la esperiencia)', 'Makisima', 'Shinya', 'Tomomi', 'Nobuchika', 2, ''),
(23, '¿Que personaje de danganrompa murió primero?', 'Kyoko', 'Touko', 'Aoi', 'Sayaka', 2, ''),
(24, '¿Quién es este personaje?', 'Sekai', 'Kotome', 'Setsuna', 'Kotonoha', 2, '24.png'),
(25, '¿Quien es convertido en vampiro en el primer capitulo de shiki? ', 'Toshio', 'Sunako', 'Seishin', 'Megumi', 2, ''),
(26, '¿Quién es este personaje? ', 'Tsugumi', 'Mana', 'Ayase', 'Inori', 2, '26.png'),
(27, '¿En tokyo ghoul quien tiene de apodo “Mono Demonio”?', 'Nishiki', 'Yakumo', 'Yoshimura', 'Enji', 2, ''),
(28, '¿Cual es el primer “Arco argumental” de Higurashi no Naku Koro ni?', 'Masacre', 'Expiación', 'Matando a un asesino', 'Raptado por el demonio', 2, ''),
(29, '¿Quien de estos personajes no pertenece al anime de Durarara?', 'Izaya', 'Shisuo', 'Celty', 'Isei', 2, ''),
(30, '¿Por qué seres está formada la legión ardiente?', 'Murlocks', 'Dragones', 'Orcos', 'Demonios', 3, ''),
(31, '¿Cómo se volvió verde la piel de los orcos?', 'Siempre fue verde', 'Por una maldición', 'Ninguna de las anteriores es correcta', 'Tras beber la sangre de Mannoroth', 3, ''),
(32, '¿Qué ocurrió con Garrosh tras los acontecimientos del asedio a Orgrimmar?', 'Fue juzgado por la Alianza', 'Murió durante el asedio', 'Fue juzgado por la Horda', 'Escapó antes de ser juzgado en Pandaria', 3, ''),
(33, '¿Qué personaje fue apodado como "el traidor"?', 'Grommash GAritoinfernal', 'Malfurión Tempestira', 'Garrosh Gritoinfernal', 'Illidan Tempestira', 3, ''),
(34, '¿Qué son los titanes?', 'Un clan enano', 'Una raza de Dioses Antiguos', 'Ninguna de las anteriores es correcta', 'Unos semidioses', 3, ''),
(35, '¿Qué Dios Antiguo se encontraba encerrado en Ulduar?', 'C´Thun', 'Y''shaar', 'N´zoth', 'Yogg-Sharon.', 3, ''),
(36, '¿Qué raza esclavizó a los Pandaren?', 'Los Mantide', 'Los Hozen', 'Los Pandaren nunca fueron esclavos', 'Los Mogu', 3, ''),
(37, '¿Qué seres de WoW son inmunes a la magia?', 'Los demonios', 'Los oráculos', 'Los elfos', 'Los dragones feéricos', 3, ''),
(38, '¿Cuál es el nombre de la famosa arma del Rey Exánime?', 'Sulfuras la mano extinta', 'Thunderfury', 'Agonía de las sombras', 'Agonía de escarcha', 3, ''),
(39, '¿Qué dragón aspecto es apodada "la soñadora"?', 'Nozdormu', 'Alexstrasza', 'Neltharion', 'Ysera', 3, '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `temas`
--

CREATE TABLE IF NOT EXISTS `temas` (
  `nombre` varchar(30) NOT NULL COMMENT 'Nombre del tema.',
  `id` int(11) NOT NULL COMMENT 'Número que identificará el tema con sus preguntas',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Se guardan los distintos temas del trivial.';

--
-- Volcado de datos para la tabla `temas`
--

INSERT INTO `temas` (`nombre`, `id`) VALUES
('Lol', 1),
('Anime', 2),
('Wow', 3);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD CONSTRAINT `clav` FOREIGN KEY (`tema`) REFERENCES `temas` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
