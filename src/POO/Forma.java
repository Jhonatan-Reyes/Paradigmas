/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POO;

public abstract class Forma {
    
    public int id;
    public String color;
    public int coordenadaCentro;
    public String nombre;
    public int info;
        
    public Forma(){
           
    }
    
    public Forma(int id, String color, int coordenadaCentro, String nombre){
        this.id=id;
        this.color=color;
        this.coordenadaCentro= coordenadaCentro;
        this.nombre= nombre;
    }
    
    /*//getters & setters
    
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
    }*/
    
    abstract public String ImprimirAtributos();
    abstract public String CambiarColor();
    abstract public int MoverCentro();
    abstract public float CalcularArea();
    abstract public float CalcularPerimetro();
    abstract public int CambiarTamano();
    abstract public double area();
    
}
