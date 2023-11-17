package com.devthalisson.desafio1.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(double amount) {
        if(amount < 100) {
            return 20;
        } else if ((amount > 100) && (amount < 200)) {
            return 12;
        }
        return 0;
    }
}
