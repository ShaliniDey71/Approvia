package com.prototype.approvia.service;

import com.prototype.approvia.model.Products;
import com.prototype.approvia.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepo;

    public List<Products> displayAllProducts(){
        return managerRepo.findAll();
    }

    public void addProduct(Products product){
        managerRepo.save(product);
    }

    public void deleteProductById(int id){
        managerRepo.deleteById(id);
    }



}
