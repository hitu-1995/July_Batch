package com.cjc.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cjc.ecommerce.model.EcommerceOrder;

public interface OrderRepository extends JpaRepository<EcommerceOrder, Integer>{

}
