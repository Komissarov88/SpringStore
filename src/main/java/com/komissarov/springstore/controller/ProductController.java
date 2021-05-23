package com.komissarov.springstore.controller;

import com.komissarov.springstore.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.komissarov.springstore.service.ProductService;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/viewProducts", method = RequestMethod.GET)
    public String viewProducts(Model uiModel) {
        uiModel.addAttribute("products", productService.getProducts());
        return "view-products";
    }

    @RequestMapping("/addProduct")
    public String addProduct(Model uiModel) {
        uiModel.addAttribute("product", new Product());
        return "add-product";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.addProduct(product);
        return "redirect:viewProducts";
    }
}
