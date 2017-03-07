/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AreaEntreCurvas;

import java.util.Scanner;

/**
 *
 * @author FAMILIA REYES
 */
public class AreaCurvas {
    
     public static void main(String[] args) {
         double intervalomenor;
         double intervalomayor;
         int paso;
         Scanner scanner = new Scanner(System.in);

         System.out.println("Digite los valores del intervalo a evaluar (primero el mayor)");
         intervalomenor = scanner.nextDouble();
         intervalomayor = scanner.nextDouble();

         System.out.println("Digite el numero pasos a evaluar");

         paso = scanner.nextInt();
         System.out.println("El area de la funcion es: " + integrar(intervalomenor, intervalomayor, paso));
         
    }

    static double integrar(double intervalomenor, double intervalomayor, int N) {
        double h = (intervalomayor - intervalomenor) / N;
        double x = 0;
        double area = (funcion(intervalomenor) + funcion(intervalomayor)) / 2;
        
        for (int i = 1; i < N; i++) {
            x = intervalomenor + h * i;
            area = area + funcion(x);
        }

        return area * h;
    }

    private static double funcion(double x) {
        return Math.pow((x+3), 2) - x*Math.sin(2*x); //(x+3)^2 - xsin(2x)
    }
}
