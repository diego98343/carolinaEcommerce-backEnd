package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.imageServiceFile;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface ImageService {

    String uploadImage(MultipartFile file)throws IOException;
}
