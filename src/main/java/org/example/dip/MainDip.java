package org.example.dip;


import org.example.dip.payment.Payment;

public class MainDip {

    public static void main(String[] args) {

        Payment payment = new Payment();
        payment.pay("250");
    }
}
