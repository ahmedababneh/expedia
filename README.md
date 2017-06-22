Introduction:
-------------

This document contains information about setting up a sandbox for the "HotelFinder" application. It also contains assumptions and known issues.

Installation Instructions:
--------------------------
In order to setup the "HotelFinder" application, you need to follow the steps below. 
If you already have Java 8 installed, then you may skip step 2. 
If you have Maven 3 installed, then you may skip step 3 too.

1- Update the server:
	
	1.1. $ sudo apt-get update -y
	1.2. $ sudo apt-get upgrade -y

2- Install Java 8:

	2.1. $ sudo add-apt-repository ppa:webupd8team/java
	2.2. $ sudo apt-get update -y
	2.3. $ sudo apt-get install oracle-java8-installer
	2.4. Verify Java installation by running: java -version. You should get something like the following:
		java version "1.8.0_121"
		Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
		Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

3- Install Maven 3:
	1.1. $ cd /opt/
	1.2. $ wget http://www-eu.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
	1.3. $ sudo tar -xvzf apache-maven-3.3.9-bin.tar.gz
	1.4. $ sudo mv apache-maven-3.3.9 maven 
	1.5. $ sudo nano /etc/profile.d/mavenenv.sh 
	1.6. Add the following lines to the mavenenv.sh, then save and close:
   	     export M2_HOME=/opt/maven
             export PATH=${M2_HOME}/bin:${PATH}
	1.7. $ sudo source /etc/profile.d/mavenenv.sh
	1.8. Verify Maven installation by running: $ mvn -V. You should get something like the following:
		Maven home: /opt/maven
		Java version: 1.8.0_121, vendor: Oracle Corporation
		Java home: /usr/lib/jvm/java-8-oracle/jre
		Default locale: en_US, platform encoding: UTF-8
		OS name: "linux", version: "3.19.0-42-generic", arch: "amd64", family: "unix"

4- Create a free Heroku account here https://signup.heroku.com/ if you do not have one already.

5- Install Heroku CLI:
	1. $ sudo add-apt-repository "deb https://cli-assets.heroku.com/branches/stable/apt ./"
	2. $ curl -L https://cli-assets.heroku.com/apt/release.key | sudo apt-key add -
	3. $ sudo apt-get update
	4. $ sudo apt-get install heroku

6- Heroku login
	6.1. Run: $ heroku keys, If the key is not there, add it manually by running: $ heroku keys:add.
	

7. Cloning Repository:
	7.1. Change the current working directory to the location where you want the cloned directory to be made. (i.e. $ cd {home_directory}/Projects)
	7.2. $ git clone https://github.com/ahmedababneh/expedia.git
 
8. Run the application:
	8.1. $ heroku open
	8.2. You should see the App opened in the browser.


Assumptions:
------------
1. OS is Ubuntu 16.04
2. git is installed


Known Issues:
-------------
None
