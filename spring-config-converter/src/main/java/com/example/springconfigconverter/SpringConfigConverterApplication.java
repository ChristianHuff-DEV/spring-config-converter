package com.example.springconfigconverter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableConfigurationProperties({CustomConfig.class})
public class SpringConfigConverterApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringConfigConverterApplication.class, args);
  }

  @Bean
  CommandLineRunner printConfig(CustomConfig customConfig, CustomFieldConverter customFieldConverter) {
    return args -> {
      customConfig.getAccount().getCustomFields().forEach((key, value) -> System.out.println(key + ": " + value.getClass().getSimpleName()));
    };
  }

}

