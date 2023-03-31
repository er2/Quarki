--liquibase formatted sql

--changeset author:eric
create table Foo (
  name text,
  nums integer[],
  date date
);