package main;
import tbm.Paciente;


public class main {
    public static void Main(String[] args) {
    	
        
        Paciente paciente1 = new Paciente("hombre", 75.0, 167.0, 23);
        Paciente paciente2 = new Paciente("mujer", 67.0, 152.0, 34);
        
        
        System.out.println("Resultados del Paciente 1");
        paciente1.calcularTbm();
        
        System.out.println("\n Resultados del Paciente 2:");
        paciente2.calcularTbm();
    }
}