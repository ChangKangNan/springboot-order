package com.example.springbootorder.mapper;

import com.example.springbootorder.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * Mapper 接口
 * </p>
 * <p>
 * * @author lidong
 *
 * @since 2019-09-04
 */
@Mapper
public interface TOrderMapper {

    /**
     * 创建订单
     *
     * @Param: order 订单信息
     * @Return:
     */
    void createOrder(@Param("order") TOrder order);

    @Update("update t_order set amount=20 where id=88")
    void updateStock();

    @Update("update t_stock set name='水杯2' where id=1")
    void updateStock1();
}
