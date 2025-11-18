package com.mapromet.proyecto.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.mapromet.proyecto.model.Producto;
import com.mapromet.proyecto.service.ProductoService;

@Controller
@RequestMapping("/gerente/productos")
public class ProductoController {

    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    // LISTAR PRODUCTOS
    @GetMapping
    public String listarProductos(Model model) {
        model.addAttribute("productos", productoService.findAll());
        return "productos_list";
    }

    // FORMULARIO NUEVO PRODUCTO
    @GetMapping("/nuevo")
    public String mostrarFormularioNuevo(Model model) {
        model.addAttribute("producto", new Producto());
        return "productos_form";
    }

    // GUARDAR PRODUCTO
    @PostMapping("/guardar")
    public String guardarProducto(@ModelAttribute Producto producto, Model model) {
        productoService.save(producto);
        model.addAttribute("producto", new Producto()); // limpiar formulario
        model.addAttribute("mensaje", "✔ Producto guardado con éxito");
        return "productos_form";
    }

    // EDITAR PRODUCTO
    @GetMapping("/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable("id") Long id, Model model) {
        // Solo devuelve Producto directamente
        Producto producto = productoService.findById(id);
        if (producto != null) {
            model.addAttribute("producto", producto);
            return "productos_form";
        } else {
            return "redirect:/gerente/productos"; // si no existe, vuelve al listado
        }
    }

    // ELIMINAR PRODUCTO
    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") Long id) {
        productoService.deleteById(id);
        return "redirect:/productos";
    }
}
