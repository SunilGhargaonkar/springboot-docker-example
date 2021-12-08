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


docker build --tag docker-example .

```
4. Run the docker image
```
docker run -p 8081:8080 docker-example
```

6. Go to the browser or postman and check one of the endpoints
   `http://localhost:8081/books/all`

## Demo
![docker-example](https://user-images.githubusercontent.com/9819702/145300262-126cf7fe-00cf-44b6-a115-6a043cbd7179.gif)
