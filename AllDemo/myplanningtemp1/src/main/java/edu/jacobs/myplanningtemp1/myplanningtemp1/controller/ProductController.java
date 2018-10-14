package edu.jacobs.myplanningtemp1.myplanningtemp1.controller;

import edu.jacobs.myplanningtemp1.myplanningtemp1.entity.Product;
import edu.jacobs.myplanningtemp1.myplanningtemp1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping(ProductController.BASEURL)
public class ProductController {

public static final String BASEURL = "/v1/products";
    @Autowired
    ProductService service;

    @GetMapping
    List<Product> getAllProducts() {

        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    Product getProductById(@PathVariable Long id) {
        return service.getProductById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product saveProducts(@RequestBody Product product) {
        return service.saveProduct(product);
    }

}
