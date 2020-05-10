FROM maven:3.6.3-jdk-11 as MAVEN_BUILD

MAINTAINER Armand Ballaci

COPY pom.xml .

COPY src src

RUN mvn dependency:go-offline -B

RUN mvn clean package -DskipTests

RUN mkdir -p target/dependency && (cd target/dependency; jar -xf ../*.jar)

# Production Stage for Spring boot application image
FROM openjdk:11-jdk-slim as production
ARG DEPENDENCY=target/dependency
COPY --from=MAVEN_BUILD ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY --from=MAVEN_BUILD ${DEPENDENCY}/META-INF /app/META-INF
COPY --from=MAVEN_BUILD ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8761
ENTRYPOINT ["java","-cp","app:app/lib/*","de.ballaci.eurekaserver.EurekaServerApplication"]
