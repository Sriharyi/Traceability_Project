package com.example.supplychain.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.supplychain.model.Supplier;
import com.example.supplychain.repository.SupplierRepository;
import com.example.supplychain.service.SupplierServiceInterface;

@Service
public class SupplierService implements SupplierServiceInterface{

    @Autowired
    private SupplierRepository repo;

    @Override
    public Supplier getById(String id) {
       Optional<Supplier> result = repo.findById(id);
      return result.isPresent()?result.get():result.orElse(result.get());
    }

    @Override
    public List<Supplier> getAllSupplier() {
       return repo.findAll();
    }

    @Override
    public void saveData(Supplier supplier) {
        repo.save(supplier);
    }

    @Override
    public void updateData(Supplier supplier) {
        repo.save(supplier);
       
    }

    @Override
    public void deleteData(String id) {
        repo.deleteById(id);
    }

}
