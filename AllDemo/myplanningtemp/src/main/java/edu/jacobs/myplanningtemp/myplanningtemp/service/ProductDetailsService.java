package edu.jacobs.myplanningtemp.myplanningtemp.service;

import edu.jacobs.myplanningtemp.myplanningtemp.entity.ProductDetails;
import edu.jacobs.myplanningtemp.myplanningtemp.repo.ProductDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

public class ProductDetailsService implements ApplicationRunner {

    @Autowired
    ProductDetailsRepo pdRepo;
    /**
     * Callback used to run the bean.
     *
     * @param args incoming application arguments
     * @throws Exception on error
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
       //pdRepo.save(ProductDetails);
    }

}
