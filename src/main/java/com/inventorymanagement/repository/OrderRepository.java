package com.inventorymanagement.repository;

import com.inventorymanagement.orderprocess.OrderProcess;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderProcess, String> {


    public OrderProcess findByCategoryId(int categoryId);


    List<OrderProcess> findBycategoryName(String categoryName);


}
