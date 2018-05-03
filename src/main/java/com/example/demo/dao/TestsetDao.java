package com.example.demo.dao;

import com.example.demo.entity.Testset;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TestsetDao extends JpaRepository<Testset,String> {

    // Testset findByUsername(String username);
}
