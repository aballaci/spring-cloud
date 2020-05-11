package de.ballaci.springdatacollege;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Armand.Ballaci
 */

@SpringBootApplication
@EnableDiscoveryClient
public class SpringDataCollegeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataCollegeApplication.class, args);
    }

}
