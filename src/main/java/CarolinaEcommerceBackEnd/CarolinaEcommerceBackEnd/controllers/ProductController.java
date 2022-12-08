package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.controllers;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Product;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.productServiceFile.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

//


@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    ProductService productService;


    @GetMapping("/products")
    public ResponseEntity<List<Product>> get() {
      List<Product> product= productService.findAll();
      return new ResponseEntity<List<Product>>(product, HttpStatus.OK);
    }

    @PostMapping( "/products")
    public ResponseEntity<Product>save(@RequestBody Product product){
        Product product1 = productService.save(product);
        return new  ResponseEntity<Product>(product1,HttpStatus.CREATED);
    }


    @GetMapping("/products/{id}")
    public ResponseEntity<Product> get(@PathVariable("id")int id){
        Product expense= productService.findById(id);
        return new ResponseEntity<Product>(expense,HttpStatus.OK);
    }


    @DeleteMapping("/products/{id}")
    public ResponseEntity<String> delete(@PathVariable("id")int id){
        productService.delete(id);
        return new ResponseEntity<String>("Expense is deleted",HttpStatus.OK);
    }






}
