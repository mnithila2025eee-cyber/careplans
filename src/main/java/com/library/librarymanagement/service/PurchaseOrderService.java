package com.library.librarymanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.library.librarymanagement.entity.PurchaseOrder;
import com.library.librarymanagement.repository.PurchaseOrderRepository;

@Service
public class PurchaseOrderService {

    private final PurchaseOrderRepository repository;

    public PurchaseOrderService(PurchaseOrderRepository repository) {
        this.repository = repository;
    }

    public PurchaseOrder createPurchaseOrder(PurchaseOrder order) {
        return repository.save(order);
    }

    public List<PurchaseOrder> getAllPurchaseOrders() {
        return repository.findAll();
    }
}