#instead of doing everything manully from terminal we could automate things here
#now from these steps we can create the image from it
#so we want the container , first we want jdk
FROM openjdk:22-jdk
#we mention the source and destenation
ADD target/Docker-0.0.1-SNAPSHOT.jar Docker-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar","/Docker-0.0.1-SNAPSHOT.jar"]