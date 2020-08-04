# Some err:
- reset server :
	+ Stop Server
	+ Right click on Tomcat /Clean
	+ Right click on Tomcat /Clean Tomcat work directory
- clean prj :
	+Project-> clean
- SSLException, No suitable driver found:
	+ Cause by conflic driver : mysql-connector-java8.0.15 and java-11
	+ Upto 8.0.16 and restart server
	+ Or by haven't add jar of driver conn
	+ Class.forName("com.mysql.jdbc.Driver"); or
	+ Double click on server -> open lauch configuation-> add at class path 
