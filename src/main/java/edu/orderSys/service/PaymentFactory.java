package edu.orderSys.service;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {

  private static final Map<String, PaymentStrategy> strategies = new HashMap<>();

  static {
    strategies.put("ApplePay", new ApplePayStrategy());
    strategies.put("VISA", new VisaPayStrategy());
  }

  public static PaymentStrategy getStrategy(String type) {
    PaymentStrategy strategy = strategies.get(type.toUpperCase());
    if (strategy == null) {
      throw new IllegalArgumentException("Unsupported payment type");
    }
    return strategy;
  }
}