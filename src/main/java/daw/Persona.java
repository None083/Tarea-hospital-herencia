/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public abstract class Persona{
    
    private String nombre;
    private String apellidos;
    private NIF nif;

    public Persona(String nombre, String apellidos, NIF nif) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public NIF getNif() {
        return nif;
    }

    public void setNif(NIF nif) {
        this.nif = nif;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("nombre=").append(nombre);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", nif=").append(nif);
        return sb.toString();
    }
    
    public void renovarNIF(LocalDate fecha){
        this.nif.renovar(fecha);
    }
    
}
