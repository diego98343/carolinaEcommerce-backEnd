package CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.services.CheckoutService;

import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Dto.Purchase;
import CarolinaEcommerceBackEnd.CarolinaEcommerceBackEnd.model.Dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
