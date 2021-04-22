package com.example.demo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface URepo extends JpaRepository<UEntity, Integer> {
 Optional<UEntity> 	findByCin(int cin);
 Boolean existsByCin(int cin);
 Boolean existsByEmail(String email);
 Boolean existsByAdress(String adress);
}
