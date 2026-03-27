package edu.orderSys;

import edu.orderSys.model.*;
import  edu.orderSys.service.*;

public class MainApp {
  public static void main(String[] args) {

    User user = new User(1L, "Alice");

    Product p1 = new Product(101L, "Book", 50.0);
    Product p2 = new Product(102L, "Pen", 5.0);

    OrderService orderService = new OrderService();

    Order order = orderService.createOrder(user);
    orderService.addProduct(order, p1, 2);
    orderService.addProduct(order, p2, 3);

    System.out.println("Total: " + order.calculateTotal());

    PaymentStrategy strategy = PaymentFactory.getStrategy("ALIPAY");
    strategy.pay(order);

    System.out.println("Order Status: " + order.getStatus());
  }
}