package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.controllers;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Order;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.OrderService.OrderService;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders(){
        List<Order> listOfOrders = orderService.findAll();
        return new ResponseEntity<List<Order>>(listOfOrders, HttpStatus.OK);
    }
}
