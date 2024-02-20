/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author FX506
 */
public class Paciente extends Persona implements Nadador {
    
    private String numeroHistorial;

    public Paciente(String numeroHistorial, String nombre, String apellidos, NIF nif) {
        super(nombre, apellidos, nif);
        this.numeroHistorial = numeroHistorial;
    }

    public Paciente() {
    }

    public String getNumeroHistorial() {
        return numeroHistorial;
    }

    public void setNumeroHistorial(String numeroHistorial) {
        this.numeroHistorial = numeroHistorial;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append(super.toString());
        sb.append("numeroHistorial=").append(numeroHistorial);
        sb.append('}');
        return sb.toString();
    }
    
    public void tomarMedicina(String medicina){
        Random random = new Random();
        Boolean seCura = random.nextBoolean();
        if (seCura){
            System.out.println("El paciente se ha curado con la medicina " + medicina);
        } else{
            System.out.println("El paciente no se ha curado con la medicina " + medicina);
        }
    }

    @Override
    public void nada() {
        System.out.println("El paciente está nadando");
    }
    
}
