/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author FX506
 */
public class Medico extends Empleado implements Nadador {

    private String especialidad;

    public Medico(String espacialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.especialidad = espacialidad;
    }

    public Medico(String numeroSeguridadSocial, double salario, String nombre, String apellidos, NIF nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medico{");
        sb.append(super.toString());
        sb.append("espacialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularIRPF() {
        if (this.especialidad.equalsIgnoreCase("cirugía")){
            return super.getSalario() * 25 / 100;
        } else{
            return super.getSalario() * 23.5 / 100;
        }
    }

    public void tratar(Paciente p, String medicina) {
        System.out.println("El médico " + super.getNombre()
                + " está tratando al paciente " + p.getNombre()
                + " con la medicina " + medicina);
    }

    @Override
    public void nada() {
        System.out.println("El médico está nadando");
    }

}
