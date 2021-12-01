/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller8;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Taller8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        double gasto1;
        double gasto2;
        double gasto3;
        double sueldo;
        int hijos = 3;
        boolean bandera = true;
        double suma = 0;
        double sueldoSemanal;
        String cadena = "";
        String salida;
        
        System.out.println("Reporte Gastos de Padres de Familia");

        while (bandera) {
            System.out.println("Ingrese su nombre y apellidos");
            nombre = entrada.nextLine();
            
            System.out.println("Ingrese su sueldo mensual");
            sueldo = entrada.nextDouble();
            
            System.out.println("Ingrese el gasto semanal del primer hijo");
            gasto1 = entrada.nextDouble();
            
            System.out.println("Ingrese el gasto semanal del segundo hijo");
            gasto2 = entrada.nextDouble();
            
            System.out.println("Ingrese el gasto semanal del tercer hijo");
            gasto3 = entrada.nextDouble();
            
            
            suma = gasto1 + gasto2 + gasto3;
            sueldoSemanal = sueldo / 4;
            
            if (suma <= sueldoSemanal){
            cadena = ("Nombre del padre de familia " + nombre + " " +
            "Sueldo semanal:$" + sueldo + " Numero de hijos:3\n"
            + "Reporte de gastos \n" + "Hijo 1, gasta semanalmente: " + gasto1
            + "\n" + "Hijo 2, gasta semanalmente: " + gasto2 + "\n" + ""
            + "Hijo 3, gasta semanalmente: " + gasto3 + "\n" + 
            "Total de gasto en hijos: " + suma + "\nEl padre de familia " + 
                    nombre + " le alcanza el dinero");
            }else{
            cadena = ("Nombre del padre de familia " + nombre + " " +
            "Sueldo semanal:$" + sueldo + " Numero de hijos:3\n"
            + "Reporte de gastos \n" + "Hijo 1, gasta semanalmente: " + gasto1
            + "\n" + "Hijo 2, gasta semanalmente: " + gasto2 + "\n" + ""
            + "Hijo 3, gasta semanalmente: " + gasto3 + "\n" + 
            "Total de gasto en hijos: " + suma + "\nEl padre de familia " + 
                    nombre + " " + "le falta el dinero");
                }
            entrada.nextLine();
            
            System.out.println("Ingrese si para salir");
            salida = entrada.nextLine();
            if (salida.equals("si")) {
                bandera = false;
            }
            System.out.println(cadena);
            
        }

    }
    
}
