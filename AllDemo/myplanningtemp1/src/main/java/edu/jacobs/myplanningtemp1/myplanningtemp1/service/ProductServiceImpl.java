package edu.jacobs.myplanningtemp1.myplanningtemp1.service;

import edu.jacobs.myplanningtemp1.myplanningtemp1.entity.Product;
import edu.jacobs.myplanningtemp1.myplanningtemp1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepo repo;


    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

    @Override
    public Product getProductById(long id) {
        return repo.findById(id).get();
    }

    @Override
    public Product saveProduct(Product product) {
        return repo.save(product);
    }
}
