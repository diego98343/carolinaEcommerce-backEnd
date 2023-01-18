package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Dto;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Address;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Customer;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Order;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.OrderItem;
import lombok.Data;

import java.util.List;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private List<OrderItem> orderItems;


}