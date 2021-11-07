package pl.edu.wszib.order.application.order;

import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.Set;

@ToString
@AllArgsConstructor
public class OrderItems {
    private final Set<OrderItem> items;
}