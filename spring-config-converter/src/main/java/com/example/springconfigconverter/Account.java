package com.example.springconfigconverter;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class Account {
  private Map<String, CustomField> customFields;
}
