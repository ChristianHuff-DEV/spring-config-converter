package com.example.springconfigconverter;


import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;


@Component
@ConfigurationPropertiesBinding
public class CustomFieldConverter implements Converter<Map<String, CustomField>, CustomField> {

  @Override
  public CustomField convert(Map<String, CustomField> source) {
    // Here the logic to create the correct instance based on the type would be implemented. But this method is not
    // being called.
    CustomField customField = new CustomField();
    return customField;
  }
}
