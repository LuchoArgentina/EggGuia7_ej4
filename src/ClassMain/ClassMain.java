/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassMain;

import Entidades.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author lucho
 */
public class ClassMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        Scanner leer = new Scanner(System.in);
        int base;
        int altura;
        
        System.out.println("Ingrese la base");
        base = leer.nextInt();
        
        
        System.out.println("Ingrese la altura");
        altura = leer.nextInt();
        
        
        Rectangulo rs = new Rectangulo(base,altura);
        
       
        System.out.println(rs.toString());
        
        int resultadoSuperficie = rs.calculaSuperficie(base, altura);
        
        System.out.println("base "+ base+ " x " + " altura "+ altura+ " = "+ resultadoSuperficie);
        
        int resultadoPerimetro = rs.calculaPerimetro(base, altura);
        
        System.out.println("base "+ base+ " y " + " altura "+ altura+ " Perimetro = "+ resultadoPerimetro);
        
        
        
        
        
    }
    
}
