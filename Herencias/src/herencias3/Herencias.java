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
public class Herencias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos objeto para la clase Estudiante
        Estudiante e = new Estudiante("René", "Elizalde", 33, 100.2);
        System.out.println(e);
        
        //Creamos el objeto para la clase Docente
        Docente d = new Docente("Luis", "Alvarez", 33, 1000);
        System.out.println(d);
        
        //Creamos el objeto para la clase Policia
        Policia p = new Policia("ALEX", "MENDOZA", 33, "Cabo");
        System.out.println(p);
        
    }
    
}
