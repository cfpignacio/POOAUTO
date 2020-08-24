/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooauto;

/**
 *
 * @author Notebook
 */
public class Auto {
    
    boolean encendido = false;
    String Marca, Color;
    
    
    //Constructor
    public Auto(){
    System.out.println("Creando Auto..");
    }
    //fin
    
    public Auto(String Marca){
     this();
     System.out.println("Creando auto marca: " + Marca);
    }
     public Auto(String Marca, String Color){
     this();
     System.out.println("Creando auto marca: " + Marca);
    }
    
    
    public void Encender(){
        encendido = true;
    }
    
    public void setColor(String color){
    this.Color = color;
    }
    
    public void Apagar(){
        encendido = false;
    }
    
    public int suma(int x){
        return x + 20;
    
    }
    
    
}
