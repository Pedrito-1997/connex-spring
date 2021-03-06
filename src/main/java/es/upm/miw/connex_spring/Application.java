package es.upm.miw.connex_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class}) // Not: /error
public class Application {

    // mvn clean spring-boot:runpublic class SystemResource {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
