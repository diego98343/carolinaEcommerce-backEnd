package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.productServiceFile;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Product;

import java.util.List;

public interface ProductService {
    List<Product>findAll();

    Product save(Product product);

    Product findById(Long id);

    void delete(Long id);
}

















//Category.servisml
//    @Autowired
//    ProductCategoryRepository productCategoryRepository;
//
//
//    @Override
//    public List<ProductCategory> findAll(){
//       return productCategoryRepository.findAll();
//    }
//
//
//    @Override
//    public ProductCategory save(ProductCategory productCategory){
//        productCategoryRepository.save(productCategory);
//
//        return productCategory;
//    }