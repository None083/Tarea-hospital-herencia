/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private List<Empleado> listaEmpleados;
    private List<Paciente> listaPacientes;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpleados = new ArrayList<>();
        this.listaPacientes = new ArrayList<>();
    }   

    public Hospital() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public List<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
    }
    

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append('}');
        return sb.toString();
    }
    
    public void contratarEmpleados(Empleado emp){
        this.listaEmpleados.add(emp);
    }
    
    public void ingresarPaciente(Paciente p){
        if(this.numeroCamas > this.listaPacientes.size()){
            this.listaPacientes.add(p);
            this.numeroCamas--;
        }
    }
    
}
