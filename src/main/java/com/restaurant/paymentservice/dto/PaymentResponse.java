package com.restaurant.paymentservice.dto;

import lombok.Data;

@Data
public class PaymentResponse {

    private Long id;

    private Long orderId;

    private Double amount;

    private String status;

}