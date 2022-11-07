package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<ProductCategory,Long> {
}
