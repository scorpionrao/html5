SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
create database hfjq_sightings;

CREATE USER 'runner_db_user'@'localhost' IDENTIFIED BY 'runner_db_password';
GRANT SELECT,INSERT,UPDATE,DELETE ON hfjq_sightings.* TO 'runner_db_user'@'localhost';

use hfjq_sightings;

CREATE TABLE runners (
	runner_id INT not null auto_increment,
	first_name varchar(100) not null,
	last_name varchar(100) not null,
	gender varchar(1) not null,
	finish_time varchar(10),
	primary key (runner_id)
);

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('John', 'Smith', 'm', '25:31');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Jacob', 'Walker', 'm', '25:54');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Mary', 'Brown', 'f', '26:01');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Jenny', 'Pierce', 'f', '26:04');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Frank', 'Jones', 'm', '26:08');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Bob', 'Hope', 'm', '26:38');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Jane', 'Smith', 'f', '28:04');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Ryan', 'Rice', 'm', '28:24');

INSERT INTO runners (first_name, last_name, gender, finish_time)
values ('Justin', 'Jones', 'm', '29:14');

INSERT INTO runners SET first_name = 'Ranga',
 last_name='Gonu', gender='m', finish_time='00:01';

select * from sightings where sighting_id > 25;

Update sightings SET creature_color = 'rgb(255,255,255)' where sighting_id = 1;

DELETE FROM sightings WHERE sighting_id > 1;