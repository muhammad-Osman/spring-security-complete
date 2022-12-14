CREATE TABLE `users` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(45) NOT NULL,
`password` VARCHAR(45) NOT NULL,
`enabled` INT NOT NULL,
PRIMARY KEY(`id`)
);

CREATE TABLE `authorities` (
`id` INT NOT NULL AUTO_INCREMENT,
`username` VARCHAR(45) NOT NULL,
`authority` VARCHAR(45) NOT NULL,
PRIMARY KEY(`id`)
);

INSERT INTO `users` VALUES(null, 'happy', '12345', 1);
INSERT INTO `authorities` VALUES(null, 'happy', 'write');

# for custom table

CREATE TABLE `customer` (
`id` INT NOT NULL AUTO_INCREMENT,
`email` VARCHAR(50) NOT NULL,
`password` VARCHAR(50) NOT NULL,
`role` VARCHAR(45) NOT NULL,
PRIMARY KEY(`id`)
);

INSERT INTO customer VALUES(null, 'usman@gmail.com', '12345', 'admin');