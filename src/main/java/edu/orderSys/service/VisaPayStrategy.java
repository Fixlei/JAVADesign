package edu.orderSys.service;

import edu.orderSys.model.Order;
import edu.orderSys.model.OrderStatus;

public class VisaPayStrategy implements PaymentStrategy {

  @Override
  public void pay(Order order) {
    System.out.println("Paid with Visa Pay: " + order.calculateTotal());
    order.setStatus(OrderStatus.PAID);
  }
}