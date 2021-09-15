package com.than.controller;

import com.than.model.Product;
import com.than.service.IProductService;
import com.than.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("")
    public ModelAndView home(){
        List<Product> productList = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("/home","listProduct",productList);
        return modelAndView;
    }


}
