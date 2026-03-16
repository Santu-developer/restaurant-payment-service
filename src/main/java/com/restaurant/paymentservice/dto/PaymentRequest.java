package com.restaurant.paymentservice.dto;

import lombok.Data;

@Data
public class PaymentRequest {

    private Long orderId;

    private Double amount;

}