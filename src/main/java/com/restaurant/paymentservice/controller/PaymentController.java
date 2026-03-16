package com.restaurant.paymentservice.controller;

import com.restaurant.paymentservice.dto.PaymentRequest;
import com.restaurant.paymentservice.dto.PaymentResponse;
import com.restaurant.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/payments")
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentService service;

    @PostMapping
    public PaymentResponse createPayment(@RequestBody PaymentRequest request) {

        return service.createPayment(request);
    }

    @GetMapping
    public List<PaymentResponse> getAllPayments() {

        return service.getAllPayments();
    }
}