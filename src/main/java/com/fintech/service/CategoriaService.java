package com.fintech.service;


import com.fintech.model.Categoria;
import java.util.*;

public class CategoriaService {
    private List<Categoria> categorias = new ArrayList<>();
    private int nextId = 1;

    public Categoria crear(String nombre) {
        Categoria c = new Categoria(nextId++, nombre);
        categorias.add(c);
        return c;
    }

    public List<Categoria> listar() { return new ArrayList<>(categorias); }

    public Categoria buscarPorId(int id) {
        for (Categoria c : categorias) if (c.getId() == id) return c;
        return null;
    }

    public boolean eliminar(int id) {
        Iterator<Categoria> it = categorias.iterator();
        while (it.hasNext()) { if (it.next().getId() == id) { it.remove(); return true; } }
        return false;
    }
}

 
}
