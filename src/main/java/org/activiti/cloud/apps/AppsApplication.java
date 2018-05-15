package org.activiti.cloud.apps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.activiti.cloud.services.security","org.activiti.cloud.services.identity","org.activiti.cloud.alfresco"})
public class AppsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AppsApplication.class,
                              args);
    }
}
