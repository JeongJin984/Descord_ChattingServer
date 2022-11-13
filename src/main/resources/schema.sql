create table user_server (
    id      BIGINT UNSIGNED AUTO_INCREMENT,
    name    VARCHAR(40) UNIQUE,
    PRIMARY KEY (id)
);

create table user_server_join (
    id          BIGINT UNSIGNED AUTO_INCREMENT,
    user_id     BIGINT UNSIGNED,
    user_level  ENUM('manager', 'owner', 'joiner'),
    server_id   BIGINT UNSIGNED,
    FOREIGN KEY (server_id) REFERENCES user_server(id),
    PRIMARY KEY (id)
);

create table voice_channel (
    id          BIGINT UNSIGNED AUTO_INCREMENT,
    name        VARCHAR(40) UNIQUE,
    server_id   BIGINT UNSIGNED,
    FOREIGN KEY (server_id) REFERENCES user_server(id),
    PRIMARY KEY (id)
);

create table chatting_channel (
    id          BIGINT UNSIGNED AUTO_INCREMENT,
    server_id   BIGINT UNSIGNED,
    name        VARCHAR(40) UNIQUE,
    FOREIGN KEY (server_id) REFERENCES user_server(id),
    PRIMARY KEY (id)
);

create table chatting_content (
    id          BIGINT UNSIGNED AUTO_INCREMENT,
    content     VARCHAR(40) UNIQUE,
    attachment  VARCHAR(255),
    createAt    DATE,
    channel_id  BIGINT UNSIGNED,
    FOREIGN KEY (channel_id) REFERENCES chatting_channel(id),
    PRIMARY KEY (id)
);

##----------------------------------------------------------------

insert into user_server(id, name) values (null, 'test1');
insert into user_server(id, name) values (null, 'test2');
insert into user_server(id, name) values (null, 'test3');

insert into user_server_join(id, user_id, user_level, server_id) values (null, 1, 'MANAGER', 1);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 2, 'OWNER', 1);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 3, 'JOINER', 1);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 1, 'MANAGER', 2);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 2, 'OWNER', 2);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 3, 'JOINER', 2);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 1, 'MANAGER', 3);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 2, 'OWNER', 3);
insert into user_server_join(id, user_id, user_level, server_id) values (null, 3, 'JOINER', 3);
