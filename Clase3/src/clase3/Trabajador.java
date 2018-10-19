/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

/**
 *
 * @author USUARIO
 */
public class Trabajador {
    //Atributos de la clase Trabajador
    private String nombres;
    private double sueldo_mensual;
    private double sueldos[];
    private String apellidos;
    
    //Metodos set y get de los atributos
    public void agregar_nombres(String n){
        nombres = n;
    }
    
    public void agregar_nombres(String n1, String n2){
        nombres = String.format("%s-%s", n1, n2);
    }
    //Metodo para agregar sueldo mensual
    public void agregar_sueldo(double sueldo){
        sueldo_mensual = sueldo;
    }
    //Metodo para agregar sueldos semanalmente
    public void agregar_sueldo(double s1, double s2, double s3,double s4){
        sueldo_mensual = s1+s2+s3+s4;
    }
    //Metodo para agregar sueldo con arreglo
    public void agregar_sueldo(double[] sueldo){
        sueldos=sueldo;
        for (int i = 0; i <sueldos.length; i++) {
            sueldo_mensual+=sueldos[i];
        }
    }
    
    public void agregar_apellidos(String n){
        apellidos = n;
    }
    
    public String obtener_nombres(){
        return nombres;
    }
    
    public String obtener_apellidos(){
        return apellidos;
    }
    
  
    public double obtener_sueldo_mensual(){
        return sueldo_mensual;
          
    }
   
    public String presentar_datos(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    //Sobreescribir el to String
     @Override
    public String toString(){
        return String.format("\n\tNombres: %s \n\tApellidos: %s\n\t"
                + "Sueldo: %.2f", obtener_nombres(), obtener_apellidos(),
                obtener_sueldo_mensual());
    }
    
    
}

