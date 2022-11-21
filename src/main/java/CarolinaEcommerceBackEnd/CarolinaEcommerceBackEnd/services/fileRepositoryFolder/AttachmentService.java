package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.fileRepositoryFolder;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Attachment;
import org.springframework.web.multipart.MultipartFile;

public interface AttachmentService {
    Attachment saveAttachment(MultipartFile file) throws Exception;

    Attachment getAttachment(String fileId) throws Exception;

}
