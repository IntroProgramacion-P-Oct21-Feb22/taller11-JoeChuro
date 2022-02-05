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
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int opcion;
        System.out.println("\tEscoge:");
        System.out.println("1. Calcular area de un cuadrado");
        System.out.println("2. Calcular area de un triangulo");
        System.out.println("3. Calcular area de un rectangulo");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            obtenerAreaCuadrado();
        } else {
            if (opcion == 2) {
                obtenerAreaTriangulo();
            } else {
                if (opcion == 3) {
                    obtenerAreaRectangulo();
                }
            }
        }

    }

    public static void obtenerAreaCuadrado() {
        Scanner entrada = new Scanner(System.in);
        int lado1;
        int lado2;
        int lado3;
        int lado4;
        int resultado = 0;
        System.out.println("Ingrese el lado 1:");
        lado1 = entrada.nextInt();
        System.out.println("Ingrese el lado 2:");
        lado2 = entrada.nextInt();;
        System.out.println("Ingrese el lado 3:");
        lado3 = entrada.nextInt();
        System.out.println("Ingrese el lado 4:");
        lado4 = entrada.nextInt();
        resultado = lado1 * lado2 * lado3 * lado4;
        System.out.println(resultado);
    }

    public static void obtenerAreaTriangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        double resultado=0;
        System.out.println("Ingrese la base");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura");
        altura = entrada.nextInt();
        
        resultado=base*altura/2;
        System.out.println(resultado);
    }
        public static void obtenerAreaRectangulo() {
        Scanner entrada = new Scanner(System.in);
        int base;
        int altura;
        double resultado=0;
        System.out.println("Ingrese la base");
        base = entrada.nextInt();
        System.out.println("Ingrese la altura");
        altura = entrada.nextInt();
        
        resultado=base*altura;
        System.out.println(resultado);
    }
}
