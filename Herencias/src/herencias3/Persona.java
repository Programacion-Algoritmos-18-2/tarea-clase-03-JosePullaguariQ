/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;


/**
 *
 * @author reroes
 */
public class Persona {
    //Atributos de la clase father
    protected String nombre;
    private String apellido;
    private int edad;
    //Constructor de la clase con 3 parametros
    public Persona(String n, String a,  int e){
        setNombre(n);
        setApellido(a);
        setEdad(e);
    }
    //Metodos de agregar y obtener
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setApellido(String n){
        apellido = n;
    }
    
    public void setEdad(int n){
        edad = n;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
        return String.format("Nombre: %s - Apellido %s - Edad %d", 
                getNombre(), getApellido(), getEdad());
    }
    
    
}
