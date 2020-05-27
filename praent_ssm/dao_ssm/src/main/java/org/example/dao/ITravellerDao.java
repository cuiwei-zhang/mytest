package org.example.dao;

import org.apache.ibatis.annotations.Select;
import org.example.domain.Traveller;

import java.util.List;

public interface ITravellerDao {
    @Select("select * from traveller where id in (select travellerId from order_traveller where orderId=#{ordersId})")
    public List<Traveller> findByOrdersId(String ordersId) throws Exception;
}
