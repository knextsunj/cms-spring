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
<br>	
<br>	
1.Have Git,Postman,maven 3,JDK 8,Eclipse 4.12 or newer,Tomcat 9,Squirrel-sql and Postgresql 11 installed.You can also use any other Eclipse version or Eclipse based IDE or Netbeans/IntelliJ provided Tomcat 9 is supported.
  You can also use another database such as MySQL or Oracle in place of Postgres but you would need to update the dependencies,DB script and configuration accordingly.
<br>	
<br> 
2.Clone this repo to your workstation/laptop/desktop using Git.
<br>	
<br> 
3.Next the Postgres DB instance must be setup.I use GhostBSD,which is a FreeBSD based desktop distro, hence I was able to    install using the postgres through the pkg system. The install automatically sets up an user
 named as 'postgres'.From here run:
<br>	
   passwd postgres
<br>	
   The above command would enable you to change the password from what is set by default to your own. From here do the following:
<br>
  su - postgres
<br>
Enter the password and login. Then:
<br>	
  createdb cms
<br>	
The above command would automatically create the cms database.Now the DB schema script is in db-scripts folder.Run this using Squirrel SQL IDE and set up the DB tables.
<br>     
The above steps should be similar if you use another Unix based system such as Linux or Mac OS X(Fink/MacPorts/Homebrew). If you are on Windows,please refer to the refer to the below link to install and configure postgresql:
 <br>    
     https://www.postgresqltutorial.com/install-postgresql/
<br>
<br> 
4. Import the project into Eclipse 4.12.
<br> 
<br>	
5. Update the username and password in the jdbc.properties file in src/main/resources.
<br> 
<br> 
6. Run the following maven command in Eclipse to build the project:
<br>
     mvn clean install
<br>     
<br> 
7. Make sure Tomcat 9 is setup in Eclipse.If you are not sure how this is done, refer the following link:
<br> 
   https://crunchify.com/step-by-step-guide-to-setup-and-install-apache-tomcat-server-in-eclipse-development-environment-ide/  <br> 
<br> 
8. To run the project, right click on the project and select Run As --> On Server. A useful article for setting up and running an web app in eclipse with tomcat is given below:
<br> 	
	https://www.zoftino.com/running-maven-web-application-on-tomcat-in-eclipse
<br> 	
	Once the application is successfully launched, you should see the welcome page:
<br> 
	http://localhost:8080/cms-backend/ 
<br>
9. The POSTMAN JSON collection is available in the file cms.postman_collection.json .You can use this to test drive the
    APIs.
	
</p>

<p>
	 Please open an issue in this repository, if you find any difficulties.
</p>
