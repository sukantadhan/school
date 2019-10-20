--------------------------------------------------------
--  File created - Sunday-October-20-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table STUDENTS
--------------------------------------------------------

  CREATE TABLE "SCOTT"."STUDENTS" 
   (	"ROLLNO" NUMBER, 
	"NAME" VARCHAR2(20 BYTE), 
	"EMAIL" VARCHAR2(20 BYTE), 
	"USERNAME" VARCHAR2(20 BYTE), 
	"PASSWORD" VARCHAR2(20 BYTE)
   ) PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into SCOTT.STUDENTS
SET DEFINE OFF;
Insert into SCOTT.STUDENTS (ROLLNO,NAME,EMAIL,USERNAME,PASSWORD) values (1,'Pratap Kumar Yadav','pratap@yahoo.com','pcdhan','password');
Insert into SCOTT.STUDENTS (ROLLNO,NAME,EMAIL,USERNAME,PASSWORD) values (2,'Anil Kumar Sharma','anil@hotmail.com','anil','password');
Insert into SCOTT.STUDENTS (ROLLNO,NAME,EMAIL,USERNAME,PASSWORD) values (3,'Pascal Smith','pascal@gmail.com','pascal','password@123');
--------------------------------------------------------
--  Constraints for Table STUDENTS
--------------------------------------------------------

  ALTER TABLE "SCOTT"."STUDENTS" MODIFY ("ROLLNO" NOT NULL ENABLE);
 
  ALTER TABLE "SCOTT"."STUDENTS" MODIFY ("NAME" NOT NULL ENABLE);
 
  ALTER TABLE "SCOTT"."STUDENTS" MODIFY ("EMAIL" NOT NULL ENABLE);
 
  ALTER TABLE "SCOTT"."STUDENTS" MODIFY ("USERNAME" NOT NULL ENABLE);
 
  ALTER TABLE "SCOTT"."STUDENTS" MODIFY ("PASSWORD" NOT NULL ENABLE);
