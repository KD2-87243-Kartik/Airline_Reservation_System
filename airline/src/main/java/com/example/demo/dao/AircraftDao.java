package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Aircraft;

public interface AircraftDao extends JpaRepository<Aircraft, Long> {

}
