DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes;

USE superheroes;

CREATE TABLE city(
name varchar(100),
cityid int NOT NULL,
PRIMARY KEY (cityid),
UNIQUE INDEX name_UNIQUE (name)
);

CREATE TABLE superhero (
id int NOT NULL AUTO_INCREMENT,
heroname varchar(50),
realname varchar(50),
creationdate date,
humanstatus boolean,
cityid int NOT NULL,
superpowers varchar(250),
power float,
PRIMARY KEY (id),
FOREIGN KEY (cityid) REFERENCES city(cityid),
UNIQUE INDEX heroname_UNIQUE (heroname)
);

CREATE TABLE superpower(
id int NOT NULL AUTO_INCREMENT,
name varchar(50),
PRIMARY KEY (id)
);

CREATE TABLE superheropower (
id int NOT NULL,
heroid int,
superpowerid int,
PRIMARY KEY (id),
FOREIGN KEY (heroid) REFERENCES superhero(id),
FOREIGN KEY (superpowerid) REFERENCES superpower(id)
);

INSERT INTO city (name, cityid) VALUES
('Gotham City', 1),
('Metropolis', 2),
('Central City', 3);

INSERT INTO superhero (heroname, realname, creationdate, humanstatus, cityid, superpowers, power) VALUES
('Batman', 'Bruce Wayne', '1939-05-01', true, 1, 'Intelligence, Combat skills', 2.3),
('Superman', 'Clark Kent', '1938-06-01', false, 2, 'Super strength, Heat vision, Flight', 5.8),
('The Flash', 'Barry Allen', '1956-10-01', true, 3, 'Super speed, Time travel', 3.2);

INSERT INTO superpower (name) VALUES
('Intelligence'),
('Combat skills'),
('Super strength'),
('Heat vision'),
('Flight'),
('Super speed'),
('Time travel');

INSERT INTO superheropower (id, heroid, superpowerid) VALUES
(1,1, 1),
(2,1, 2),
(3,2, 3),
(4,2, 4),
(5,2, 5),
(6,3, 6),
(7,3, 7);

CREATE USER 'teller'@'localhost' IDENTIFIED BY 'Teller501!';
GRANT ALL PRIVILEGES ON superheroes.* TO 'teller'@'localhost';
FLUSH PRIVILEGES;
