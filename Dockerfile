FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} demo-docker-service.jar
ENTRYPOINT [ \
    "java", \
    "-jar", \
    "/demo-docker-service.jar" \
]
