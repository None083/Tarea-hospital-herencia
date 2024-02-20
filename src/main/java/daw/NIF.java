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
public class NIF {
    
    private String numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public NIF(String numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = letra;
        this.fechaCaducidad = fechaCaducidad;
    }

    public NIF() {
    }

    public String getNumero() {
        return numero;
    }

    public char getLetra() {
        return letra;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF{");
        sb.append("numero=").append(numero);
        sb.append(", letra=").append(letra);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append('}');
        return sb.toString();
    }
    
//    private char calcularLetra(){
//        
//    }
    
    public void renovar(LocalDate fechaSolicitud){
        
    }
    
}
