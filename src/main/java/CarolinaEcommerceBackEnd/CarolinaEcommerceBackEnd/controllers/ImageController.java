package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.controllers;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Image;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.imageServiceFile.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashSet;
import java.util.Set;

@RestController
@RequestMapping("/api")
public class ImageController {

    @Autowired
    ImageService imageService;


    public void uploadImage(MultipartFile[] multipartFiles){

        Set<Image> imageModels= new HashSet<>();

        for (MultipartFile file: multipartFiles ) {
            Image image = new Image(


            );

        }
    }
}
