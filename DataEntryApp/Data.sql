BEGIN TRANSACTION;

DROP TABLE IF EXISTS user_data;

CREATE TABLE user_data (
	user_id serial PRIMARY KEY,
	user_name varchar(100) NOT NULL,
	user_age int,
	user_title varchar(50) NOT NULL,
	user_hometown varchar(100)
);

INSERT INTO user_data (user_name, user_age, user_title, user_hometown)
VALUES ('Jennifer', 33, 'Ms.', 'Struthers, Ohio'), ('Mary', 34, 'Miss', 'Ashville, Ohio');
INSERT INTO user_data (user_name, user_title)
VALUES ('Molly', 'Mrs.'), ('Jake', 'Sr.'), ('Kyle', 'Mr.');
COMMIT;



