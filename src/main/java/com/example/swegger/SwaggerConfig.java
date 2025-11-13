package com.example.swegger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @EnableSwagger2
        @Bean
        public Docket api() {

            return new Docket(DocumentationType.SWAGGER_2);
        }

    }
