package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.service;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Product;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceLPM implements ProductService{

    ProductRepository productRepository;

    @Override
    public List<Product> findAll(){
        return productRepository.findAll();
    }
}
