/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author FX506
 */
public class GestionHospital {
    
    public static void main(String[] args) {
        
        //Hospital
        Hospital h1 = new Hospital("María Dolores", "C/Mala vida, 13", 300);
        
        //Empleados
        Empleado m1 = new Medico("cirujía", "1233", 
                1500, "Arturo", "Heredia", 
                new NIF("1234567890", LocalDate.now()));
        Empleado m2 = new Medico("oftalmología", "3345", 
                1700, "María", "Castilla", 
                new NIF("4567891235", LocalDate.of(2023, 12, 29)));
        
        Empleado a1 = new Administrativo(Grupo.C, "6849", 
                1300, "Aida", "Gomez",
                new NIF("7896789458", LocalDate.now()));
        Empleado a2 = new Administrativo(Grupo.D, "7895", 
                1000, "Mario", "Fernandez",
                new NIF("8754545534", LocalDate.now()));
        Empleado a3 = new Administrativo(Grupo.E, "354", 
                1500, "Jesús", "Pérez",
                new NIF("3251247451", LocalDate.now()));
        
        //Contratación
        h1.contratarEmpleados(m1);
        h1.contratarEmpleados(m2);
        h1.contratarEmpleados(a1);
        h1.contratarEmpleados(a2);
        h1.contratarEmpleados(a3);
        
        //Pacientes
        Paciente p1 = new Paciente("68476", "Minerva", "Toledo", 
                new NIF("7894525879", LocalDate.now()));
        Paciente p2 = new Paciente("65486", "Manolo", "Ortíz", 
                new NIF("7895123458", LocalDate.now()));
        Paciente p3 = new Paciente("75868", "Begoña", "González", 
                new NIF("1234587964", LocalDate.now()));
        Paciente p4 = new Paciente("77777", "Humberto", "Aragón", 
                new NIF("3124589231", LocalDate.now()));
        Paciente p5 = new Paciente("88888", "Jose", "Martinez", 
                new NIF("1112457896", LocalDate.now()));
        
        //Ingreso en el hospital
        h1.ingresarPaciente(p1);
        h1.ingresarPaciente(p2);
        h1.ingresarPaciente(p3);
        h1.ingresarPaciente(p4);
        h1.ingresarPaciente(p5);
        
        System.out.println("-------Médico trata a paciente, aleatorio----------");
        tratarAleatorio(h1.getListaEmpleados(), h1.getListaPacientes());
        
        System.out.println("-------Método abstracto empleados----------");
        for (Empleado e : h1.getListaEmpleados()) {
            System.out.println(e.getNombre() + " " + e.getApellidos() + " con salario " 
                    + e.getSalario() + " tiene un IRPF de: " + e.calcularIRPF());
        }
        
        System.out.println("-------Método interfaz nadador----------");
        List<Nadador> listaNadadores = encontrarNadadores(h1.getListaEmpleados(), h1.getListaPacientes());
        for (Nadador n : listaNadadores) {
            System.out.println(n);
            n.nada();
        }
        
        System.out.println("-------Renovar DNI de Jose Martinez----------");
        p5.renovarNIF(LocalDate.now());
        System.out.println(p5);
        
    }
    
     private static List<Nadador> encontrarNadadores(List<Empleado> listaEmpleados, List<Paciente> listaPacientes){
        ArrayList<Nadador> listaNadadores = new ArrayList<>();
        
        for (Empleado e : listaEmpleados) {
            if (e instanceof Nadador) {
                listaNadadores.add((Nadador) e);
            }
        }
        for (Paciente p : listaPacientes) {
            if (p instanceof Nadador) {
                listaNadadores.add((Nadador) p);
            }
        }
        return listaNadadores;
    }
    
    private static void tratarAleatorio(List<Empleado> listaEmpleados, List<Paciente> listaPacientes){
        medicoAleatorio(listaEmpleados)
                .tratar(pacienteAleatorio(listaPacientes), "Pancetamol");
    }
    
    private static Medico medicoAleatorio(List<Empleado> lista){
        ArrayList<Medico> medicos = new ArrayList<>();
        Random random = new Random();
        
        for (Empleado e : lista) {
            if (e instanceof Medico) {
                medicos.add((Medico) e);
            }
        }

        return medicos.get(random.nextInt(medicos.size()));
    }
    
    private static Paciente pacienteAleatorio(List<Paciente> lista){
        Random random = new Random();
        return lista.get(random.nextInt(lista.size()));
    }
    
}
