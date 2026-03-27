package edu.orderSys.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private Long id;
  private User user;
  private List<OrderItem> items = new ArrayList<>();
  private OrderStatus status = OrderStatus.CREATED;

  public Order(Long id, User user) {
    this.id = id;
    this.user = user;
  }

  public void addItem(Product product, int quantity) {
    items.add(new OrderItem(product, quantity));
  }

  public double calculateTotal() {
    return items.stream()
        .mapToDouble(OrderItem::getTotalPrice)
        .sum();
  }

  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }
}
