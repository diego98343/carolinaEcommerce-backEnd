package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.RegistrationRespoFile;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Registration;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationServieML implements RegistrationService{
    
    
    @Autowired
    RegistrationRepository registrationRepository;
    
    @Override
    public List<Registration> findAll(){
        return registrationRepository.findAll();
    }

    @Override
    public Registration saveRegistration(Registration registration) {
        registrationRepository.save(registration);
        return registration;
    }

    @Override
    public Registration findRegistrationById(int id) {
        registrationRepository.findById(id);
    }

    @Override
    public void delete(int id) {

    }


}
