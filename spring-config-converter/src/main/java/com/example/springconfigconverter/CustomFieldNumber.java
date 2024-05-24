package com.example.springconfigconverter;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomFieldNumber extends CustomField {
  private int decimalDigits;
}
