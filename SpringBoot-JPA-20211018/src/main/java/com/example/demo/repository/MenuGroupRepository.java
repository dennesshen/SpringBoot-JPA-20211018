package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.twoway.ManyToOne.MenuGroup;

@Repository
public interface MenuGroupRepository extends JpaRepository <MenuGroup, Long>{

}
