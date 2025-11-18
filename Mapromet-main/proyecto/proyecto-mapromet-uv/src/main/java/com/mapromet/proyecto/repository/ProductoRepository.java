package com.mapromet.proyecto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mapromet.proyecto.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
