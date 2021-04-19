package com.zyx.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zyx.order.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderMapper extends BaseMapper<Order> {

    List<Order> getList();

    void add(Order order);
}
