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
public class Policia extends Persona {
    //Atributo de la clase 
    private String rango;
    //Constructor de la clase
    public Policia(String n, String a, int e, String r){
        super(n, a, e);
        setRango(r);
    }
    //Metodos de agregar y obtener
     public void setRango(String r){
        rango = r;
    }
    
    public String getRango(){
        return rango;
    } 
    //Metodo de sobreescribir el toString
    @Override
    public String toString(){
    
        return String.format("%s - Rango %s", super.toString(), getRango());
    }

}

