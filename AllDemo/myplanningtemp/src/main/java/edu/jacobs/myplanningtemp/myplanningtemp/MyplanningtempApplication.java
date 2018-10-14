package edu.jacobs.myplanningtemp.myplanningtemp;

import edu.jacobs.myplanningtemp.myplanningtemp.entity.ProductDetails;
import edu.jacobs.myplanningtemp.myplanningtemp.repo.ProductDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class MyplanningtempApplication {

    @Autowired
    private ProductDetailsRepo pdRepo;


    @Component
    class DataSetup implements ApplicationRunner {
        /**
         * Callback used to run the bean.
         *
         * @param args incoming application arguments
         * @throws Exception on error
         */
        @Override
        public void run(ApplicationArguments args) throws Exception {
            System.out.println(" JJaaccoobb  >>>>  >> > >");
            pdRepo.save(ProductDetails.builder().productDesc("MyProductDesc1").productName("MyProductName1").build());
            pdRepo.save(ProductDetails.builder().productDesc("MyProductDesc2").productName("MyProductName2").build());
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(MyplanningtempApplication.class, args);
    }
}
