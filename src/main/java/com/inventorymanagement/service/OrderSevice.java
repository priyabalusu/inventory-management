package com.inventorymanagement.service;

import com.inventorymanagement.orderprocess.OrderProcess;

import java.util.List;
import java.util.Optional;

public interface OrderSevice {
    public OrderProcess getOrderProcess(int categoryId);

    public Optional<OrderProcess> getOrderProcess(String categoryName);

    public String createOrderProcess(OrderProcess orderProcess);

    public String updateOrderProcess(OrderProcess orderProcess);

    public String deleteOrderProcess(int categoryId);

    public List<OrderProcess> getOrderProcess();

    List<OrderProcess> getAllOrderProcess();

    List<OrderProcess> getBycategoryName(String categoryName);
}


