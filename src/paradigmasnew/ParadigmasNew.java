package taller1;
import javax.swing.*;

class Punto {
        public int x;
        public int y;

        public Punto(int x, int y){
            this.x = x;
            this.y = y;
        }        

        /////////prueba github
        
        // calcula distancia a otro punto
        public double distancia(Punto p2){
            return Math.sqrt(Math.pow(p2.x-this.x,2) + Math.pow(p2.y-this.y,2));
        }
    }    

    class Circulo{
        public Punto centro;
        public int radio;

        public Circulo(Punto centro, int radio){
            this.centro =  centro;
            this.radio = radio;
        }        
    }


    public class Programa
    {        
        public static void main(String[] args)
        {
            Punto p = new Punto(8,9);            
            Circulo c = new Circulo(new Punto(5,5),5);

            // calculo una sola vez
            double d = p.distancia(c.centro);
            System.out.println("La distancia es de "+d+"  unidades\n");

            if (d== (double) c.radio)                
                System.out.println("Punto en zona perimetral del círculo");
            else            
                if (d> (double) c.radio)                
                    System.out.println("Punto fuera del círculo");
                else
                    System.out.println("Punto dentro del círculo");
        }
    }