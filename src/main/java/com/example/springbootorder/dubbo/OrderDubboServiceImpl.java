package com.example.springbootorder.dubbo;

import com.example.springbootcommonservice.dto.OrderDTO;
import com.example.springbootcommonservice.dubbo.OrderDubboService;
import com.example.springbootcommonservice.response.ObjectResponse;
import com.example.springbootorder.service.ITOrderService;
import io.seata.core.context.RootContext;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: heshouyou
 * @Description
 * @Date Created in 2019-09-04
 */
@DubboService
@Slf4j
@Service
@Transactional
public class OrderDubboServiceImpl implements OrderDubboService {

    @Autowired
    private ITOrderService orderService;

    @Override
    public ObjectResponse<OrderDTO> createOrder(OrderDTO orderDTO) {
        log.info("全局事务id ：" + RootContext.getXID());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return orderService.createOrder(orderDTO);
    }
}
