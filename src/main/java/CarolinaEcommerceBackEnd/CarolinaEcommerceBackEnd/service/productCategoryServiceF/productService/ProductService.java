package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.service.productCategoryServiceF.productService;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Product;

import java.util.List;

public interface ProductService {
    List<Product>findAll();

    Product save(Product product);
}
