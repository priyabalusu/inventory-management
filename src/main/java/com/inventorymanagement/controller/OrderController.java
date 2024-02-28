package com.inventorymanagement.controller;


import com.inventorymanagement.orderprocess.OrderProcess;
import com.inventorymanagement.service.OrderSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/orderprocess")
public class OrderController {
    @Autowired
    OrderSevice orderSevice;
    @GetMapping("/{categoryId}")
    public OrderProcess getOrderProcess(@PathVariable int categoryId) {
       return orderSevice.getOrderProcess(categoryId);

    }

    @PostMapping("/")
    public OrderProcess createOrderProcess(@RequestBody OrderProcess orderProcess) {
        orderSevice.createOrderProcess(orderProcess);
        return orderProcess ;

    }

    @PutMapping("/")
    public OrderProcess updateOrderProcess(@RequestBody OrderProcess orderProcess){
        orderSevice.updateOrderProcess(orderProcess);
        return orderProcess;
    }

  @DeleteMapping("/{categoryId}")
      public String deleteOrderProcess(@PathVariable int categoryId){
        return orderSevice.deleteOrderProcess(categoryId);


   }

  @GetMapping("/category/{categoryName}")
 public List<OrderProcess> getBycategoryName(@PathVariable String categoryName){
        return orderSevice.getBycategoryName(categoryName);
  }
}
