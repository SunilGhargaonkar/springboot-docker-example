FROM openjdk:11
EXPOSE 8080
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} docker-example.jar
ENTRYPOINT [ \
    "java", \
    "-jar", \
    "/docker-example.jar" \
]
