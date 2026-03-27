package edu.orderSys.service;
import edu.orderSys.model.Order;

public interface PaymentStrategy {
  void pay(Order order);
}