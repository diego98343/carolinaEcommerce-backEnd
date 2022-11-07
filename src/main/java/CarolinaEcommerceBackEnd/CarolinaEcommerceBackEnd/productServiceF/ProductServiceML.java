package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.productServiceF;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Product;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceML implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product>findAll(){
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product){
         productRepository.save(product);
         return product;
    }



}
