package com.restaurant.paymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RestaurantPaymentServiceApplication {

	public static void main(String[] args) {

        SpringApplication.run(RestaurantPaymentServiceApplication.class, args);
        System.out.println("Jay Shree Ram - 9");
	}

}
