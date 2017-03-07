/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tareas;

import java.util.Scanner;

/**
 *
 * @author FAMILIA REYES
 */
public class AreaCurvas {
    
    public static void main(String[] args){
        double a,b;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite los valores del intervalo a evaluar");
        a=scanner.nextDouble();
        b=scanner.nextDouble();
        System.out.println("Digite el numero pasos a evaluar");

        int paso = scanner.nextInt();
        System.out.println("El area de la funcion es: " + integrar(a, b, paso));
    }
    
     static double integrar(double a, double b, int N) {
        double h = (b - a) / N;
        double x = 0;
        double area = (funcion(a) + funcion(b)) / 2;
        
        for (int i = 1; i < N; i++) {
            x = a + h * i;
            area = area + funcion(x);
        }

        return area * h;
    }

    private static double funcion(double x) {
        return Math.pow(x, 4) - Math.sin(x); //x4 - sin(x)
    }
}
