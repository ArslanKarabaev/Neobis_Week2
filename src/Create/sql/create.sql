CREATE TABLE Coffee(
	coffee_id BIGINT NOT NULL,
	amount INT NOT NULL,
	price INT NOT NULL,
	sort VARCHAR(64) NOT NULL,
	withMilk BOOLEAN NOT NULL,
	user_id BIGINT REFERENCES USERS(user_id)
 );
 CREATE TABLE Users(
 	user_id BIGINT PRIMARY KEY NOT NULL,
 	firstName VARCHAR(64) NOT NULL,
 	secondName VARCHAR(64) NOT NULL,
 	age INT NOT NULL,
 	email VARCHAR(128) NOT NULL,
 	mobNum VARCHAR(64) NOT NULL,
 	password VARCHAR(128) NOT NULL
  );