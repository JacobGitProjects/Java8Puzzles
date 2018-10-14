package edu.jacobs.myplanningtemp1.myplanningtemp1.repo;

import edu.jacobs.myplanningtemp1.myplanningtemp1.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

//@RepositoryRestResource(path = "products", collectionResourceRel = "products")
@Repository
public interface ProductRepo extends JpaRepository<Product, Long> {
}
