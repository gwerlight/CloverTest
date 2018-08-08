-- begin CLOVERTEST_ROOT_ENTITY
create table CLOVERTEST_ROOT_ENTITY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    BEZEICHNUNG varchar(255),
    --
    primary key (ID)
)^
-- end CLOVERTEST_ROOT_ENTITY
-- begin CLOVERTEST_SUB_ELEMENT1
create table CLOVERTEST_SUB_ELEMENT1 (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(255),
    BEZEICHNUNG varchar(255),
    ROOT_ENTITY_ID varchar(36),
    --
    primary key (ID)
)^
-- end CLOVERTEST_SUB_ELEMENT1
