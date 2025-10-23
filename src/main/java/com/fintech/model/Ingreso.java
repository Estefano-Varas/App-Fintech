package com.fintech.model;

public class Ingreso {
    
    private int id;
    private String fecha; 
    private double monto;
    private Categoria categoria;
    private Descripcion descripcion;

    public Ingreso() {}

    public Ingreso(int id, String fecha, double monto, Categoria categoria, Descripcion descripcion) {
        this.id = id;
        this.fecha = fecha;
        this.monto = monto;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }

    public double getMonto() { return monto; }
    public void setMonto(double monto) { this.monto = monto; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }

    public Descripcion getDescripcion() { return descripcion; }
    public void setDescripcion(Descripcion descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Ingreso[" + id + "] " + fecha + " | S/ " + String.format("%.2f", monto)
               + " - " + categoria + " - " + descripcion;
    }
}


