package com.example.demo.business.repository;

import com.example.demo.business.dto.Portada;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PortadaRepository extends JpaRepository<Portada, Long> {
}
