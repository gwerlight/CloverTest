-- begin CLOVERTEST_SUB_ELEMENT1
alter table CLOVERTEST_SUB_ELEMENT1 add constraint FK_CLOVERTEST_SUB_ELEMENT1_ON_ROOT_ENTITY foreign key (ROOT_ENTITY_ID) references CLOVERTEST_ROOT_ENTITY(ID)^
create index IDX_CLOVERTEST_SUB_ELEMENT1_ON_ROOT_ENTITY on CLOVERTEST_SUB_ELEMENT1 (ROOT_ENTITY_ID)^
-- end CLOVERTEST_SUB_ELEMENT1
