/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author FX506
 */
public class Administrativo extends Empleado {
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    public Administrativo(String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administrativo{");
        sb.append(super.toString());
        sb.append("grupo=").append(grupo);
        sb.append('}');
        return sb.toString();
    }
    
    public void registrarDocumento(String documento){
        System.out.println(super.getNombre() + " " + super.getApellidos() 
                + " ha registrando el documuento " + documento 
                + " con hashcode " + documento.hashCode());
    }
    
    public double calcularIRPF(){
        return super.getSalario() * this.grupo.getIrpf();
    }
    
}
