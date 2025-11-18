package com.mapromet.proyecto.model;

import javax.persistence.*;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

    private String cliente;

    @Column(length = 1000)
    private String descripcion;

    // RELACIÓN CON GERENTE
    @ManyToOne
    @JoinColumn(name = "gerente_id") // FK en tabla productos
    private Gerente gerente;

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getPrecio() { return precio; }
    public void setPrecio(Double precio) { this.precio = precio; }

    public String getCliente() { return cliente; }
    public void setCliente(String cliente) { this.cliente = cliente; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Gerente getGerente() { return gerente; }
    public void setGerente(Gerente gerente) { this.gerente = gerente; }
}
