package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.Payment;
import com.library.librarymanagement.repository.PaymentRepository;

@Service
public class PaymentService {

    private final PaymentRepository repository;

    public PaymentService(PaymentRepository repository) {
        this.repository = repository;
    }

    public Payment makePayment(Payment payment) {
        return repository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return repository.findAll();
    }
}