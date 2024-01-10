FROM openjdk:17-jdk

WORKDIR /app

COPY .mvn/ .mvn

COPY mvnw pom.xml ./

RUN ./mvnw dependency:resolve

COPY src ./src
CMD ["./mvnw", "spring-boot:run", "-Dspring-boot.run.profiles=mysql"]
#CMD ["./mvnw", "spring-boot:run"]
