package com.example.youbookingbootdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class YouBookingBootDockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YouBookingBootDockerApplication.class, args);
    }

}
