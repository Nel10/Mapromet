package com.mapromet.proyecto.service;

import java.util.List;
import com.mapromet.proyecto.model.Producto;

public interface ProductoService {
    List<Producto> findAll();
    Producto findById(Long id);
    Producto save(Producto producto);
    void deleteById(Long id);
}
