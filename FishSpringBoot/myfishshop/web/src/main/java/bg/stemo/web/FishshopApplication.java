package bg.stemo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"bg.stemo"})
public class FishshopApplication {

    public static void main(String[] args) {
        SpringApplication.run(FishshopApplication.class, args);
    }
}

