package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.controllers;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Image;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Product;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.productServiceFile.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

//
//@CrossOrigin("*")

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

    @PostMapping(value = {"/products"}, consumes = {MediaType.MULTIPART_FORM_DATA_VALUE})
    public ResponseEntity<Product>save(

            @RequestPart("product") Product product,
            @RequestPart("imageFile")MediaType[]file

             ){
        Product product1 = productService.save(product);
        return new  ResponseEntity<Product>(product1,HttpStatus.CREATED);
    }


   public void uploadImage(MultipartFile[] multipartFiles){

    Set<Image> imageModels= new HashSet<>();

      for (MultipartFile file: multipartFiles ) {
       Image image = new Image(


       );

     }
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
