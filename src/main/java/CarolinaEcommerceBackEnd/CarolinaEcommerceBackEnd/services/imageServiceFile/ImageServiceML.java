package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.imageServiceFile;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.imageUtils.ImageUtils;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Image;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Objects;

@Service
public class ImageServiceML implements ImageService {

    @Autowired
    private ImageRepository imageRepository;

    @Override
    public String uploadImage(MultipartFile file) throws IOException {

        Image image= imageRepository.save(Image.builder()
                .name(file.getOriginalFilename())
                .type(file.getContentType())
                .pictureByte(ImageUtils.compressImage(file.getBytes())).build());


         return"file uploaded";

    }

}
