package com.fintech.model;


public class Descripcion {
    private String texto;
    
    public Descripcion() {}
    public Descripcion(String texto) { this.texto = texto; }
    
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }
    
    @Override
    public String toString() { return texto;}
}
