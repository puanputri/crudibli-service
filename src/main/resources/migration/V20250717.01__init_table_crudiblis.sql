-- V1__create_crudiblis_table.sql

-- enable UUID generation (if not already present)
CREATE
EXTENSION IF NOT EXISTS "uuid-ossp";

-- create crudiblis table
CREATE TABLE crudiblis
(
    id          VARCHAR(36) PRIMARY KEY DEFAULT uuid_generate_v4(),
    name        VARCHAR(100) NOT NULL,
    species     VARCHAR(100) NOT NULL,
    film        VARCHAR(100) NOT NULL,
    magical     BOOLEAN      NOT NULL   DEFAULT false,
    habitat     VARCHAR(100),
    power_level INT          NOT NULL
);

