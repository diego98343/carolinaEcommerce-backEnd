package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.OrderService;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Order;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.checkOutRespostories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderRepositorypml implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public List<Order>findAll(){
        return orderRepository.findAll();
    }




}
