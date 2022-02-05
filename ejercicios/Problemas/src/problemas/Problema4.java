/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String cedula;
        int opcion;
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();
        System.out.println("Ingrese su numero de cedula: ");
        cedula = entrada.nextLine();
        System.out.println("\tEscoja:");
        System.out.println("1. Para calcular el valor de la luz:");
        System.out.println("2. Para calcular el valor del predio:");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerValorLuz(nombre, cedula);
        }
        if (opcion == 2){
            obtenerPredio(nombre, cedula);
        }
    }

    public static void obtenerValorLuz(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double vkilovatio;
        int nkilovatios;
        double resultado;
        String cadena="";
        System.out.println("Ingrese el numero de kilovatios");
        nkilovatios = entrada.nextInt();
        System.out.println("Ingrese el valor del kilovatios");
        vkilovatio = entrada.nextDouble();
        resultado = vkilovatio * nkilovatios;
        cadena=String.format("Cliente %s con cedula %s debe cancelar el valor de %.2f",
                a,b,resultado);
        System.out.println(cadena);
    }
    public static void obtenerPredio(String a, String b) {
        Scanner entrada = new Scanner(System.in);
        double valorInmueble;
        double resultado;
        String cadena;
        System.out.println("Ingrese valor del inmueble");
        valorInmueble=entrada.nextDouble();
        resultado=valorInmueble*2/100;
        cadena=String.format("Cliente %s con cedula %s debe cancelar el valor de %.2f",
                a,b,resultado);
        System.out.println(cadena);
    }
}
