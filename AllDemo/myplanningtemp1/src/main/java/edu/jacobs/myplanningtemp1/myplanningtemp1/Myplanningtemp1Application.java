package edu.jacobs.myplanningtemp1.myplanningtemp1;

import edu.jacobs.myplanningtemp1.myplanningtemp1.entity.Product;
import edu.jacobs.myplanningtemp1.myplanningtemp1.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class Myplanningtemp1Application implements CommandLineRunner {


    public static void main(String[] args) {
        SpringApplication.run(Myplanningtemp1Application.class, args);
    }

    /**
     * Callback used to run the bean.
     *
     * @param args incoming main method arguments
     * @throws Exception on error
     */
    @Override
    public void run(String... args) throws Exception {

       /* Product p1 = new Product();
        p1.setDesc("desc1");
        p1.setName("name1");
        repo.save(p1);


        Product p2 = new Product();
        p2.setDesc("desc2");
        p2.setName("name2");
        repo.save(p2);


        Product p3 = new Product();
        p3.setDesc("desc3");
        p3.setName("name3");
        repo.save(p3);*/


    }
}
