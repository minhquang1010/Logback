package com.example.demologback;


import ch.qos.logback.classic.util.ContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class DemoLogbackApplication {


    public static void main(String[] args) {


// System.setProperty(ContextInitializer.CONFIG_FILE_PROPERTY, "src/main/logback.xml");

        SpringApplication.run(DemoLogbackApplication.class, args);

    }

}
