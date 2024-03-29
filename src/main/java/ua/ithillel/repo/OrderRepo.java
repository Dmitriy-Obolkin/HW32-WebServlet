package ua.ithillel.repo;

import ua.ithillel.model.Order;

import java.util.List;

public interface OrderRepo {
    List<Order> getAll();
    Order getById(Integer id);
    boolean add(Order order);
    boolean remove(Integer id);
    boolean existsById(Integer id);
}
