/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencias3;

/**
 *
 * @author USUARIO
 */
public class Docente extends Persona{
    //Atributo de la clase
    private double sueldo;
    //Constructor de la clase
    public Docente(String n, String a, int e, double s){
        super(n, a, e);
        setSueldo(s);
    }
    //Metodos de agregar y obtener
     public void setSueldo(double s){
        sueldo = s;
    }
    
    public double getSueldo(){
        return sueldo;
    } 
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
    
        return String.format("%s - Sueldo %f", super.toString(), getSueldo());
    }

}