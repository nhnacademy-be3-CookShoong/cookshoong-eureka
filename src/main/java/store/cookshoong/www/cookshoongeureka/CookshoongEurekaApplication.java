package store.cookshoong.www.cookshoongeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CookshoongEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CookshoongEurekaApplication.class, args);
    }

}
