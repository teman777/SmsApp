CREATE DATABASE IF NOT EXISTS SMS;
USE SMS;

CREATE TABLE IF NOT EXISTS Message(
  ID int PRIMARY KEY AUTO_INCREMENT
 ,CreatedDate date
 ,Text varchar(255)
);

-- Такой подход не 3НФ, но через отдельную таблицу не сумел красиво смаппить
CREATE TABLE IF NOT EXISTS Tag(
  ID int PRIMARY KEY AUTO_INCREMENT
 ,Name varchar(20)
 ,MessageID int
 ,Val varchar(255)
 ,FOREIGN KEY(MessageID) REFERENCES Message(ID)
);

-- Можно было бы пользователей сделать через отдельную таблицу, однако это не имеет смысла - все равно ID = номеру телефона
CREATE TABLE IF NOT EXISTS NumberMessageRelation(
  ID int PRIMARY KEY AUTO_INCREMENT
 ,Number numeric(20, 0)
 ,MessageID int
 ,FOREIGN KEY(MessageID) REFERENCES Message(ID)
);

commit;
