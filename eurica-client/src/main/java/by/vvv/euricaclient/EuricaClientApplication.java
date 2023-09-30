package by.vvv.euricaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EuricaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EuricaClientApplication.class, args);
    }

}
