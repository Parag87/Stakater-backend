FROM openjdk:8-jre-alpine

WORKDIR /usr/src/app

COPY build/libs/stakater-0.0.1-SNAPSHOT.jar /usr/src/app/stakater-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD ["/usr/bin/java", "-jar", "stakater-0.0.1-SNAPSHOT.jar"]

