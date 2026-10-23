package com.prototype.approvia.repository;

import com.prototype.approvia.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ManagerRepository extends JpaRepository<Products, Integer> {

    void deleteByProductName(String productName);
}
