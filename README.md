# school


# Step-1: Import SQL

Import `STUDENTS.sql` and `MARK.sql` into your oracle database.

Login to sqlplus and import sql files, make sure `/path/to` is correct file location

`SQL>@/path/to/STUDENTS.sql`

`SQL>@/path/to/MARK.sql`


# Step-2: Eclipse

From Eclipse open project
`Open->Import Project from File system or Archive`

From Eclipse, set Java Compiler Version to 1.8
`Right Click on Project -> Properties -> Java Compiler`

Uncheck `Use Compliance From Execution Environment ...`
Select Compiler Level to 1.8


From Eclipse, set Project Facet to 1.8
`Right Click on Project -> Properties -> Java Facets ->Java`

# Step-3: Run Applicaion

`Right Click on Project -> Run As -> Run On Server`

If Tomcat 9.0 is not configured, download Binary Distributions of Tomcat https://tomcat.apache.org/download-90.cgi
and configure in your Eclipse.


