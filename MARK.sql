--------------------------------------------------------
--  File created - Sunday-October-20-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table MARK
--------------------------------------------------------

  CREATE TABLE "SCOTT"."MARK" 
   (	"ROLLNO" NUMBER, 
	"SUBJECT" VARCHAR2(20 BYTE), 
	"MARK" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.MARK
SET DEFINE OFF;
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'MIL','60');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'Math','50');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'English','90');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'History','45');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'Geography','61');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'Sanskrit','68');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (3,'Science','91');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'MIL','42');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'Math','56');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'English','70');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'History','95');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'Geography','51');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'Sanskrit','58');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (2,'Science','81');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'MIL','12');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'Math','86');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'English','50');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'History','25');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'Geography','61');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'Sanskrit','38');
Insert into SCOTT.MARK (ROLLNO,SUBJECT,MARK) values (1,'Science','41');
--------------------------------------------------------
--  Constraints for Table MARK
--------------------------------------------------------

  ALTER TABLE "SCOTT"."MARK" MODIFY ("ROLLNO" NOT NULL ENABLE);
 
  ALTER TABLE "SCOTT"."MARK" MODIFY ("SUBJECT" NOT NULL ENABLE);
 
  ALTER TABLE "SCOTT"."MARK" MODIFY ("MARK" NOT NULL ENABLE);
