package com.prototype.approvia.controller;

import com.prototype.approvia.model.Products;
import com.prototype.approvia.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/manager")
public class ManagerController {


    @Autowired
    ManagerService managerService;

    @GetMapping("/products")
    public List<Products> allProducts(){
        return managerService.displayAllProducts();
    }

    @PostMapping("/add-product")
    public ResponseEntity<String> addProduct(@RequestBody Products product){
        managerService.addProduct(product);
        return ResponseEntity.ok("Added");
    }

    @DeleteMapping("/deleted/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        managerService.deleteProductById(id);
        return ResponseEntity.ok("Deleted");
    }
}
