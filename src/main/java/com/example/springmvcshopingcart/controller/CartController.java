package com.example.springmvcshopingcart.controller;

import com.example.springmvcshopingcart.entity.CartEntity;
import com.example.springmvcshopingcart.entity.ProductEntity;
import com.example.springmvcshopingcart.service.CartService;
import com.example.springmvcshopingcart.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("cart")
public class CartController {

    @Autowired
    private CartEntity cartEntity;

    @Autowired
    private ProductService productService;

    @PostMapping
    public String add(@ModelAttribute("product") ProductEntity product, Model model) {
        System.out.println("requstID" + product.getId());
        cartEntity.addItem(product);

        model.addAttribute("products", productService.getAll());
        model.addAttribute("product", new ProductEntity());
        return "product-list";
    }


}
