package com.crio.stock.annualreturnapp;
// package com.crio.warmup:annual-return:1.0.0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AnnualReturnAppApplication {

  public static void main(String[] args) {
    SpringApplication.run(AnnualReturnAppApplication.class, args);
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("*/**").allowedOrigins("*");
      }
    };
  }

}
