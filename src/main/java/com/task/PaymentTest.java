package com.task;

import org.testng.annotations.Test;

interface Payment {
    String pay();
}

class CreditCardPayment implements Payment {
    @Override
    public String pay() {
        return "Payment done using Credit Card";
    }
}

public class PaymentTest {
    @Test
    public void testPaymentMethod() {
        Payment p = new CreditCardPayment();
        System.out.println(p.pay()); // Expected: "Payment done using Credit Card"
    }
}