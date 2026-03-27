package edu.orderSys.service;
import edu.orderSys.model.*;

import java.util.concurrent.atomic.AtomicLong;

  public class OrderService {

    private AtomicLong orderIdGenerator = new AtomicLong(1);

    public Order createOrder(User user) {
      return new Order(orderIdGenerator.getAndIncrement(), user);
    }

    public void addProduct(Order order, Product product, int quantity) {
      order.addItem(product, quantity);
    }
  }
