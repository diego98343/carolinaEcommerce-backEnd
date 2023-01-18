package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.CheckoutService;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Dto.Purchase;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Dto.PurchaseResponse;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Order;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CheckOutServicelpml implements   CheckoutService {

    private CustomerRepository customerRepository;

    //this constructor replace the AUTOWIRE
    public CheckOutServicelpml(CustomerRepository customerRepository ){
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase){

        //retrieve the order info from dto

        Order order = purchase.getOrder();

        //generate tracking number


        //populate order with orderitems


        return  null;
    }

}
