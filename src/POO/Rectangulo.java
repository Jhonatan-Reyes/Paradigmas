/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

/**
 *
 * @author JHONATAN REYES
 */

public class Rectangulo extends Forma{
    private float lado1;
    private float lado2;
    
    public Rectangulo( int id, String color, int coordenadaCentro, String nombre, int info, float lado1, float lado2){
        
    }
    
    
    
     public float getLado1() {
         return lado1;
     }
     public void setlado1(int lado1) {
         this.lado1 = lado1;
     }
     
      public float getLado2() {
         return lado2;
     }
     public void setlado2(int lado2) {
         this.lado2 = lado2;
     }
     
     public int getId(){
        return id;
    }
    
    public void setId(){
        this.id=id;
    }
    
    public String getColor(){
        return color;
    }
    
    public void setColor(){
        this.color=color;
    }
    
    public int getcoordenadaCentro(){
        return coordenadaCentro;
    }
    
    public void setCoordenadaCentro(){
        this.coordenadaCentro=coordenadaCentro;
    }
    
    public int getNombre(){
        return id;
    }
    
    public void setNombre(){
        this.id=id;
    }
   
    /*public String ImprimirAtributos(int id, String color, int coordenadaCentro, String nombre, int info, int lado1, int lado2) {
        return null;
    }*/

    @Override
    public String CambiarColor() {
        return null;
    }

    @Override
    public int MoverCentro() {
        return 0;
    }

    @Override
    public float CalcularArea() {
        float area;
        area= lado1*lado2;
        return area;
    }

    @Override
    public float CalcularPerimetro() {
        float perimetro;
        perimetro=(lado1*2)+(lado2*2);
        return 0;
    }

    @Override
    public int CambiarTamano() {
        return 0;
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String ImprimirAtributos() {
        return null;
    }
     
     
    
}
