/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Trabajador t = new Trabajador();
        //Arreglo para almacenar sueldos
        //double sueldos[] = new double[4];
        System.out.println("Número de nombres del trabajador 1 o 2");
        int numero_nombres = scanner.nextInt();
        scanner.nextLine();//limpiar el escanner
        //Preguntamos si desamos 1 o mas nombres del trabajador
        if(numero_nombres==1){
            System.out.println("Ingrese el nombre del trabajador");
            String nombre = scanner.nextLine();
            t.agregar_nombres(nombre);
        }else{
            System.out.println("Ingrese el nombre uno del trabajador");
            String nombre1 = scanner.nextLine();
            System.out.println("Ingrese el nombre dos del trabajador");
            String nombre2 = scanner.nextLine();
            t.agregar_nombres(nombre1, nombre2);
        } 
        System.out.println("Ingrese el apellido del trabajador");
        String apellidos = scanner.nextLine();
        t.agregar_apellidos(apellidos);
        System.out.println("-----------------------------------");
        System.out.println("Desea ingresar el valor del sueldo mensual (opcion 1) por semanas (opcion 2)");
        int res=scanner.nextInt();
        if (res==1) {
            //Opcion para leer sueldo mensual
            System.out.println("Ingrese el sueldo del trabajador mensualmente");
            double sueldo = scanner.nextDouble();
            t.agregar_sueldo(sueldo);
        }else{
            //Opcion para leer sueldos semanalmente
            System.out.println("Ingrese el sueldo del trabajador semanalmente");
            double s1 = scanner.nextDouble();
            System.out.println("Ingrese el sueldo del trabajador semanalmente");
            double s2 = scanner.nextDouble();
            System.out.println("Ingrese el sueldo del trabajador semanalmente");
            double s3 = scanner.nextDouble();
            System.out.println("Ingrese el sueldo del trabajador semanalmente");
            double s4 = scanner.nextDouble();
            t.agregar_sueldo(s1,s2,s3,s4);
            
            /*CODIGO PARA INGRESAR LOS SUELDOS SEMANALMENTE USANDO UN ARREGLO
            System.out.println("Ingrese el sueldo del trabajador semanalmente");
            for (int i = 0; i < 4; i++) {
               sueldos[i]=scanner.nextDouble();     
            }
            t.agregar_sueldo(sueldos);
            */
        }  
        //Presentar los datos
        System.out.printf("Los datos del trabajador son: %s\n", t);           
    }
}
