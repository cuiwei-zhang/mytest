package org.example.service;

import org.apache.ibatis.annotations.Select;
import org.example.domain.Product;

import java.util.List;

public interface IProductService {

    public List<Product> findAll() throws Exception;

    void save(Product product) throws Exception;


}
