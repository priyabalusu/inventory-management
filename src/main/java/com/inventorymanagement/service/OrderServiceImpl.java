package com.inventorymanagement.service;

import com.inventorymanagement.orderprocess.OrderProcess;
import com.inventorymanagement.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderSevice {
  @Autowired

    OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderProcess getOrderProcess(int categoryId) {
       return orderRepository.findByCategoryId(categoryId);


    }

    @Override
    public String createOrderProcess(OrderProcess orderProcess) {
        // More Business Logic
        orderRepository.save(orderProcess);
        return "Success";
    }

    @Override
    public String updateOrderProcess(OrderProcess orderProcess) {
        // More Business Logic
        orderRepository.save(orderProcess);
        return "Success";
    }

//    @Override
//    public String deleteOrderProcess(String categoryId) {
//        // More Business Logic
//     orderRepository.deleteById(categoryId);
//        return "Success";
//    }

    @Override
    public List<OrderProcess> getOrderProcess() {
      return null;
    }

    @Override
    public Optional<OrderProcess> getOrderProcess(String categoryId) {

        return orderRepository.findById(categoryId);
    }
    @Override
    public List<OrderProcess> getAllOrderProcess() {
        // More Business Logic
        return orderRepository.findAll();
    }

    @Override
    public List<OrderProcess> getBycategoryName(String categoryName)
    {
       return   orderRepository.findBycategoryName(categoryName);
    }

    @Override
    public String deleteOrderProcess(int categoryId) {
        orderRepository.deleteById(String.valueOf(categoryId));

        return "success";
    }


    }

