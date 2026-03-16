package com.restaurant.paymentservice.mapper;

import com.restaurant.paymentservice.dto.PaymentRequest;
import com.restaurant.paymentservice.dto.PaymentResponse;
import com.restaurant.paymentservice.model.Payment;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    Payment toEntity(PaymentRequest request);

    PaymentResponse toResponse(Payment payment);
}

