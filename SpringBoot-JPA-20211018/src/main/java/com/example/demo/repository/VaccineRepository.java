package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.oneway_OneToMany.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository <Vaccine, Long>{

}
