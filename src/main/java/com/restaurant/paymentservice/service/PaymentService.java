package com.restaurant.paymentservice.service;

import com.restaurant.paymentservice.dto.PaymentRequest;
import com.restaurant.paymentservice.dto.PaymentResponse;

import java.util.List;

public interface PaymentService {

    PaymentResponse createPayment(PaymentRequest request);

    List<PaymentResponse> getAllPayments();

}