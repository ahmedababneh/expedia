Introduction:
-------------

This document contains information about setting up a sandbox for the "HotelFinder" application. It also contains assumptions.

Installation Instructions:
--------------------------
In order to setup the "HotelFinder" application, you need to follow the steps below. 
If you already have Java 8 installed, then you may skip step 2. 
If you have Maven 3 installed, then you may skip step 3 too.

1- Update the server:
	
	$ sudo apt-get update -y
	$ sudo apt-get upgrade -y

2- Install Java 8:

	$ sudo add-apt-repository ppa:webupd8team/java
	$ sudo apt-get update -y
	$ sudo apt-get install oracle-java8-installer
	$ java -version. 

After running the last command, you should get something like the following:

	java version "1.8.0_121"
	Java(TM) SE Runtime Environment (build 1.8.0_121-b13)
	Java HotSpot(TM) 64-Bit Server VM (build 25.121-b13, mixed mode)

3- Install Maven 3:

	$ cd /opt/
	$ wget http://www-eu.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
	$ sudo tar -xvzf apache-maven-3.3.9-bin.tar.gz
	$ sudo mv apache-maven-3.3.9 maven 
	$ sudo nano /etc/profile.d/mavenenv.sh 
	Add the following lines to mavenenv.sh, then save and close:
   	     export M2_HOME=/opt/maven
             export PATH=${M2_HOME}/bin:${PATH}
	$ sudo source /etc/profile.d/mavenenv.sh
	$ mvn -V

you should now see:

		Maven home: /opt/maven
		Java version: 1.8.0_121, vendor: Oracle Corporation
		Java home: /usr/lib/jvm/java-8-oracle/jre
		Default locale: en_US, platform encoding: UTF-8
		OS name: "linux", version: "3.19.0-42-generic", arch: "amd64", family: "unix"

4- Create a free Heroku account here https://signup.heroku.com/ if you do not have one already.

5- Install Heroku CLI:

	$ sudo add-apt-repository "deb https://cli-assets.heroku.com/branches/stable/apt ./"
	$ curl -L https://cli-assets.heroku.com/apt/release.key | sudo apt-key add -
	$ sudo apt-get update
	$ sudo apt-get install heroku

6- Heroku login:
	
	$ heroku login
	$ heroku keys

If the key is not there, add it manually by running: $ heroku keys:add.

7. Cloning Repository:
	
	$ cd {home_directory}/Projects
	$ git clone https://github.com/ahmedababneh/expedia.git
 
8. Run the application:
	
	$ heroku open

You should see the App opened in the browser.


Assumptions:
------------
1. OS is Ubuntu 16.04
2. git is installed
