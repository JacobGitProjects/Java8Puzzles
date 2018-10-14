package edu.jacobs.myplanningtemp.myplanningtemp.repo;

import edu.jacobs.myplanningtemp.myplanningtemp.entity.ProductDetails;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "product", collectionResourceRel = "product")
public interface ProductDetailsRepo extends PagingAndSortingRepository<ProductDetails, Long> {
}
