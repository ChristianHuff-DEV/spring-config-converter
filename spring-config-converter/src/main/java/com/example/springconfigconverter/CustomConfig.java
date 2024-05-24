package com.example.springconfigconverter;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("org.example")
@Getter
@Setter
public class CustomConfig {
  private Account account;

}
