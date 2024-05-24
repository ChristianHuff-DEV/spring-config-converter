package com.example.springconfigconverter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomFieldString extends CustomField {
  private int minLength;
  private int maxLength;
}
