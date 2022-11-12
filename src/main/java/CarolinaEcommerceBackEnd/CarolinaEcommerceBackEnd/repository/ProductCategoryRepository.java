package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {
}
