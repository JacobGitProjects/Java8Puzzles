package edu.jacobs.myplanningtemp1.myplanningtemp1.service;

import edu.jacobs.myplanningtemp1.myplanningtemp1.entity.Product;
import org.springframework.stereotype.Component;

import java.util.List;

public interface ProductService  {

   List<Product> getAllProducts();

   Product getProductById(long id);

   Product saveProduct(Product product);
}
