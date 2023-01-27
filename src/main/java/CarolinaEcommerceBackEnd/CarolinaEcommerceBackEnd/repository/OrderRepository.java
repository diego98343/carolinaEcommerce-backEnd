package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
