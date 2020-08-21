package com.ordermanagement.Order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@EnableDiscoveryClient
@SpringBootApplication
@EnableSwagger2

public class OrderApplication {
	public static void main(String[] args) {
		SpringApplication.run(OrderApplication.class, args);
	}
	@Bean
    public Docket CustomerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
               .select()

               .apis(RequestHandlerSelectors.basePackage("com.ordermanagement.Order"))
               .build().apiInfo(apiDetails());
    }
 
 private ApiInfo apiDetails() {
        ApiInfo apiInfo = new ApiInfo(
                "Order API",
                "This API will provide information about Order details",
                "1.0.0",
                "Free to use",
                "ord@org.com",
                "API license: Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0.html");

        return apiInfo;
    }
}
