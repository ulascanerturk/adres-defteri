DROP TABLE IF EXISTS `kisiler`;
CREATE TABLE `kisiler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `isim` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `soyisim` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `adres` varchar(255) COLLATE utf8_turkish_ci DEFAULT NULL,
  `email` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  `telefon` varchar(45) COLLATE utf8_turkish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

INSERT INTO `kisiler` VALUES
	(1,'Ulascan','Erturk','İstanbul','me@ulascanerturk.com','00000000'),
    (2,'Selim','Kalcioglu','Trabzon','selim@ulascanerturk.com','00000000'),
    (3,'Hasan','Ulusoy','Eskişehir','hasan@ulascanerturk.com','00000000'),
    (4,'Burak','Zengin','Samsun','burak@ulascanerturk.com','00000000'),
    (5,'Sinan','Altay','Sinop','sinan@ulascanerturk.com','00000000'),
    (6,'Neslihan','Acar','İstanbul','neslihan@ulascanerturk.com','00000000');