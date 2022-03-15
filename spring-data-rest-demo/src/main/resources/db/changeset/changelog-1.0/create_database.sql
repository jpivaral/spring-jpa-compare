use spring_data_rest_db;

create table person(
    person_id int auto_increment primary key,
    first_name varchar(50) not null
);

create table email(
    email_id int auto_increment primary key,
    email varchar(50) not null unique,
    person_id int,
    CONSTRAINT FK_PersonEmail FOREIGN KEY (person_id)
        REFERENCES person(person_id)
);