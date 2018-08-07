# Microservice-Demo
This is used for Microservice Demo


Bare minimum to run: 

#To create fat jar

Spring actuator

mvn clean install

mvn package

 

mvn install:install-file -Dfile=conference-0.0.1-SNAPSHOT.jar -DgroupId=com.conference -DartifactId=conference -Dversion=0.0.1-SNAPSHOT -Dpackaging=jar -DgeneratePom=true
