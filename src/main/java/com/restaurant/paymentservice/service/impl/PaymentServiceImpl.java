package com.restaurant.paymentservice.service.impl;

import com.restaurant.paymentservice.dto.PaymentRequest;
import com.restaurant.paymentservice.dto.PaymentResponse;
import com.restaurant.paymentservice.mapper.PaymentMapper;
import com.restaurant.paymentservice.model.Payment;
import com.restaurant.paymentservice.repository.PaymentRepository;
import com.restaurant.paymentservice.service.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository repository;
    private final PaymentMapper mapper;

    @Override
    public PaymentResponse createPayment(PaymentRequest request) {

        Payment payment = mapper.toEntity(request);

        payment.setStatus("SUCCESS");

        Payment saved = repository.save(payment);

        return mapper.toResponse(saved);
    }

    @Override
    public List<PaymentResponse> getAllPayments() {

        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .collect(Collectors.toList());
    }
}