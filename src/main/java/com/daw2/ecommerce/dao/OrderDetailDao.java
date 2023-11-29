package com.daw2.ecommerce.dao;

import com.daw2.ecommerce.entity.OrderDetail;
import com.daw2.ecommerce.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
