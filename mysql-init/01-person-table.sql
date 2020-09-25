CREATE DATABASE demo;

CREATE TABLE demo.person (
    name VARCHAR(255) PRIMARY KEY,
    age INT
);

INSERT INTO demo.person (name, age) VALUES ('steven', 99);
INSERT INTO demo.person (name, age) VALUES ('dan', 12);
INSERT INTO demo.person (name, age) VALUES ('tim', 50);
