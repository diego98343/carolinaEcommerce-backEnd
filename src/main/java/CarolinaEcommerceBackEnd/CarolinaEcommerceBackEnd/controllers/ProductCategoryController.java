package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.controllers;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.ProductCategory;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.ProductCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/productCategory")
@RestController
public class ProductCategoryController {
//    @Autowired
//    ProductCategoryRepository productCategoryRepository;
//
//    @GetMapping("/productCategory")
//    public ResponseEntity<List<ProductCategory>> get(){
//       List<ProductCategory> categories=productCategoryRepository
//       return new ResponseEntity<List<ProductCategory>>(categories,HttpStatus.OK);
//    }
}
