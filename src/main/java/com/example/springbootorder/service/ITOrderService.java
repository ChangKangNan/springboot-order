package com.example.springbootorder.service;

import com.example.springbootcommonservice.dto.OrderDTO;
import com.example.springbootcommonservice.response.ObjectResponse;

/**
 * <p>
 * 创建订单
 * </p>
 *
 * * @author lidong
 *
 * @since 2019-09-04
 */
public interface ITOrderService {

    /**
     * 创建订单
     */
    ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO);
}
