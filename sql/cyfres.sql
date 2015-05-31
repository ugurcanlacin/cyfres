CREATE DATABASE `cyfres`;

CREATE TABLE IF NOT EXISTS `cyfres`.`User`(
`id` int(11) not null auto_increment primary key,
`name` nvarchar(64) ,
`nick` nvarchar(64) not null,
`password` nvarchar(255) not null,
`email` nvarchar(64) not null unique,
`level` int(3),
`creation_timestamp` date NOT NULL,
`activation` nvarchar(255),
`actived` tinyint(1) NOT NULL DEFAULT '0',
`forgot` tinyint(1) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `cyfres`.`Episode`(
`id` int(11) not null auto_increment primary key,
`name` nvarchar(64) ,
`date` date NOT NULL,
`season` nvarchar(255),
`number` nvarchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `cyfres`.`Season`(
`id` int(11) not null auto_increment primary key,
`number` nvarchar(64) ,
`series` nvarchar(64)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `cyfres`.`Cast`(
`id` int(11) not null auto_increment primary key,
`name` nvarchar(64) ,
`image` nvarchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `cyfres`.`UserMeta`(
`id` int(11) not null auto_increment primary key,
`favoritedGenres` nvarchar(255),
`favoritedSeries` nvarchar(255),
`favoritedEpisode` nvarchar(255),
`watchedEpisode` nvarchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE IF NOT EXISTS `cyfres`.`Genre`(
`id` int(11) not null auto_increment primary key,
`name` nvarchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `cyfres`.`SeriesMeta`(
`id` int(11) not null auto_increment primary key,
`casts` nvarchar(255),
`genres` nvarchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


CREATE TABLE IF NOT EXISTS `cyfres`.`Series`(
`id` int(11) not null auto_increment primary key,
`name` nvarchar(255),
`rating` nvarchar(64),
`ratingCount` nvarchar(64),
`image` nvarchar(255),
`critic` nvarchar(255),
`review` nvarchar(255),
`lastUpdate` nvarchar(255),
`lastEpisode` nvarchar(255),
`latestEpisode` nvarchar(255),
`url` nvarchar(255)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE `cyfres`.`SeriesMeta`;

CREATE TABLE IF NOT EXISTS `cyfres`.`series_casts`(
`series_id` int(11) not null,
`casts_id` int(11) not null,
CONSTRAINT `series_casts_fk` FOREIGN KEY (`series_id`) 
REFERENCES `Series` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `castsfk` FOREIGN KEY (`casts_id`) 
REFERENCES `Cast` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
)

CREATE TABLE IF NOT EXISTS `cyfres`.`series_genres`(
`series_id` int(11) not null,
`genres_id` int(11) not null,
CONSTRAINT `series_genres_fk` FOREIGN KEY (`series_id`) 
REFERENCES `Series` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
CONSTRAINT `genresfk` FOREIGN KEY (`genres_id`) 
REFERENCES `Genre` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
)

