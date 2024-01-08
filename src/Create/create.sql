CREATE TABLE Users(
 	user_id BIGINT PRIMARY KEY NOT NULL,
 	firstName VARCHAR(64) NOT NULL,
 	secondName VARCHAR(64) NOT NULL,
 	age INT NOT NULL,
 	email VARCHAR(128) NOT NULL,
 	mobNum VARCHAR(64) NOT NULL,
 	password VARCHAR(128) NOT NULL
  );
CREATE TABLE Coffee(
	coffee_id BIGINT NOT NULL,
	amount INT NOT NULL,
	price INT NOT NULL,
	sort VARCHAR(64) NOT NULL,
	withMilk BOOLEAN NOT NULL,
	user_id BIGINT REFERENCES USERS(user_id)
 );

insert into users(user_id, firstname,secondname, age, email, mobnum, password)
values (1, 'Arslan', 'Karabaev', 18, 'arslankarabaev08@gmail.com', '0552020803','123')

insert into users(user_id, firstname,secondname, age, email, mobnum, password)
values (2, 'Aktilek','Kamilov', 20, 'kamilovaktilek@gmail.com', '0123456789', '456'),
(3,'Rustam','Kasymov', 21, 'kasymovrustam@gmail.com', '0987654321','789')

update users set age = 20 where firstname = 'Arslan'

insert into coffee(coffee_id, name, amount, price,sort, withmilk,user_id)
values (1, 'latte', 250,200,'arabika',true, 1),


insert into coffee(coffee_id, name, amount, price,sort, withmilk,user_id)
values (2, 'capuchino', 220,180,'arabika',true, 2),
 (3, 'espresso', 120, 30,'arabika',false, 1)

update coffee set amount = 30 where name = 'espresso'
update coffee set price = 120 where name = 'espresso'

delete from users  where user_id = 3