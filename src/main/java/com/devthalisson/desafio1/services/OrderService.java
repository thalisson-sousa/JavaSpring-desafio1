package com.devthalisson.desafio1.services;

import com.devthalisson.desafio1.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public double total(Order order) {
        double porcented = order.getDiscount() / 100;
        double descount = order.getBasic() * porcented;

        return (order.getBasic() - descount) + shippingService.shipment(order.getBasic());
    }

}
