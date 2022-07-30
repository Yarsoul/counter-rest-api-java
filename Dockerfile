FROM openjdk:18
COPY target/counter-rest-api-java-0.0.1-SNAPSHOT.jar counter2.jar
ENTRYPOINT ["java", "-jar", "/counter2.jar"]