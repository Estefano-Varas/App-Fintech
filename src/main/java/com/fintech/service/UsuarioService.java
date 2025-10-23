
package com.fintech.service;

import com.fintech.model.Usuario;


public class UsuarioService {

     private Usuario usuario;

    
    public void crearUsuario(int id, String nombre, String correo, int dni, String clave, int edad) {
        usuario = new Usuario(id, nombre, correo, dni, clave, edad);
        System.out.println("Usuario creado exitosamente.");
    }

    
    public void mostrarUsuario() {
        if (usuario != null) {
            System.out.println(usuario);
        } else {
            System.out.println("No hay usuario registrado.");
        }
    }

   
    public void actualizarDatos(String nuevoNombre, String nuevoCorreo, int nuevaEdad) {
        if (usuario != null) {
            usuario.setNombre(nuevoNombre);
            usuario.setCorreo(nuevoCorreo);
            usuario.setEdad(nuevaEdad);
            System.out.println("Datos actualizados correctamente.");
        } else {
            System.out.println("Debe crear un usuario primero.");
        }
    }

    
    public Usuario getUsuario() {
        return usuario;
    }
    
}
