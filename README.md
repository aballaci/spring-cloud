# spring-cloud

* Setting up microservices
* Exposing and consuming external configurations
* Working with the Eureka service
* Consuming services
* Consuming an interface with Feign

# Usage

docker-compose up -d

call the service:
http://localhost:8080/employees/10001

Eureka server:
http://localhost:8761/

<code>docker pull genschsa/mysql-employees</code>

<code> docker run -d   --name mysql-employees   -p 3306:3306   -e MYSQL_ROOT_PASSWORD=college   -v $PWD/data:/var/lib/mysql   genschsa/mysql-employees</code>

