package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.repository.checkOutRespostories;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.checkOut.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemsRepository extends JpaRepository<OrderItem,Integer> {
}
