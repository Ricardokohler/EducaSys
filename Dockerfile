FROM eclipse-temurin:21
LABEL mantainer="ricardokohlermk@gmail.com"
WORKDIR	/app
EXPOSE 8080
COPY target/EducaSys-0.0.1-SNAPSHOT.jar EducaSys-0.0.1.jar
ENTRYPOINT ["java", "-jar", "EducaSys-0.0.1.jar"]
