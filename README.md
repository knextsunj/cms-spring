# cms-spring
Contact Management System - Spring version

This repository contains an sample application for a contact management system intended to serve as an information system for personal information of all 
employees of a micro/small business.

<p>This application is a Work-in-Progress. Many features are still to be developed. </p>

<p>Technology Stack:
 <br> 
Spring 5
<br>  
Hibernate 5
  <br>
JBoss Narayana 
  <br>
Jackson
  <br>
REST-WS with Spring MVC
  <br>
Postgresql
 </p>

<p>
Please note that this project DOES NOT USE SPRING BOOT. It is a traditional web application written using Spring Framework and other technologies given above.
</p>

<p>
To run this project,you would need to do the following:
1.Have Git,Postman,maven 3,JDK 8,Eclipse 4.12 or newer,Tomcat 9,Squirrel-sql and Postgresql 11 installed.You can also use any other Eclipse version or Eclipse based
  IDE or Netbeans/IntelliJ provided Tomcat 9 is supported.
2.Clone this repo to your workstation/laptop/desktop using Git.
3.Next the Postgres DB instance must be setup.I use GhostBSD,which is a 
   FreeBSD based desktop distro, hence I was able to install using the postgres through the pkg system. The install automatically sets up an user
   named as 'postgres'.From here run:
   $ passwd postgres
   The above command would enable you to change the password from what is set by default to your own. From here do the following:
   $ su - postgres
   Enter the password and login. Then:
   $ createdb cms
     The above command would automatically create the cms database.Now the DB schema script is in src/main/resources/db-scripts folder.Run this
     using Squirrel SQL IDE and set up the DB tables.
     
    The above steps should be similar if you use another Unix based system such as Linux or Mac OS X(Fink/MacPorts/Homebrew). If you are on Windows,please refer to the
     refer to the below link to install and configure postgresql:
     
     https://www.postgresqltutorial.com/install-postgresql/
          
4. Import the project into Eclipse 4.12.

5. Update the username and password in the jdbc.properties file in src/main/resources.

6. Run the following maven command in Eclipse to build the project:
     mvn clean install
     
7. Make sure Tomcat 9 is setup in Eclipse.If you are not sure how this is done, refer the following link:
	https://crunchify.com/step-by-step-guide-to-setup-and-install-apache-tomcat-server-in-eclipse-development-environment-ide/   
	
8. To run the project, right click on the project and select Run As --> On Server. A useful article for setting up and running an web app in eclipse
   with tomcat is given below:
	https://www.zoftino.com/running-maven-web-application-on-tomcat-in-eclipse
	
	Once the application is successfully launched, you should see the welcome page:

	http://localhost:8080/cms-backend/ 
</p>

