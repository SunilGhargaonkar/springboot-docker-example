# Spring Boot Application Containerization Example

<p>
This project is to show how to dockerize simple springboot application.
</p>

## How to run it
1. Run below command and see there are no errors
```
mvn clean && mvn package && java -jar target/docker-example.jar
```
2. Then build the docker by running below commands
```
cd projects/springboot-docker-example

docker build .
docker build -t docker-example .

docker run -p 8081:8080 docker-example
```

3. Go to the browser or postman and check one of the endpoints
   `http://localhost:8081/books/all`

## Demo
![springboot-docker-example](https://user-images.githubusercontent.com/9819702/145116202-16f9bb49-0ec0-40d6-9c6c-8819e7beacb5.gif)
