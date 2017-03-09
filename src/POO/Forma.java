/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

public abstract class Forma {
    
    private int id;
    private String color;
    private int coordenadaCentro;
    private String nombre;
    private int info;
        
    public Forma(){
           
    }
    
    public Forma(int id, String color, int coordenadaCentro, String nombre){
        this.id=id;
        this.color=color;
        this.coordenadaCentro= coordenadaCentro;
        this.nombre= nombre;
    }
    
    //getters & setters
    
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
    
    public abstract String Imprimir();
    public abstract int Area();
    public abstract int Perimetro();
    
    
}
