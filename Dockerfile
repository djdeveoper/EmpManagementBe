FROM openjdk:17
COPY target/sb.jar app/sb.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","sb.jar"]

