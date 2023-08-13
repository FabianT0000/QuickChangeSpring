package com.edu.sena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.sena.models.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
