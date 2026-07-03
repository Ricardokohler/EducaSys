FROM eclipse-temurin:17-jre
WORKDIR	/app
EXPOSE 8080:8080
COPY target/EducaSys-0.0.1-SNAPSHOT.jar app.jar 
ENTRYPOINT ["java", "jar", "app.jar"] 
