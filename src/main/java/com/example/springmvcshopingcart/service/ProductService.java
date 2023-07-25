package com.example.springmvcshopingcart.service;

import com.example.springmvcshopingcart.entity.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getAll();
}
