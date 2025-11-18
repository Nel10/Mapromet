package com.mapromet.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.mapromet.proyecto.model.Producto;
import com.mapromet.proyecto.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Producto findById(Long id) {
        Optional<Producto> optional = productoRepository.findById(id);
        return optional.orElse(null);
    }

    @Override
    public Producto save(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public void deleteById(Long id) {
        productoRepository.deleteById(id);
    }
}
