/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculador p=new Calculador();
        Scanner miScanner=new Scanner(System.in);
        Punto miPunto=new Punto();
        
        System.out.println("X1");        
            
        p.punto1.setX(miScanner.nextInt());
        
        System.out.println("Y1");        
        p.punto1.setY(miScanner.nextInt());
        
        System.out.println("X2");        
         p.punto2.setX(miScanner.nextInt());
             
        System.out.println("Y2");        
        p.punto2.setY(miScanner.nextInt());
        
        System.out.println("El área bajo el segmento de recta es:");
        System.out.println(p.calcularArea());
        System.out.println("La distancia entre los puntos es:");
        System.out.println(p.calcularDistancia());
        System.out.println("La pendiente del segmento de recta es:");
        System.out.println(p.calcularPendiente());
        
        
        
        
    }
    
}
