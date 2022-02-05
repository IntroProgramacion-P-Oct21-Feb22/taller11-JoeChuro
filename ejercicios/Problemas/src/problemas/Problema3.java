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
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        System.out.println("Ingrese la nota 1: ");
        nota1 = entrada.nextDouble();
        System.out.println("Ingrese la nota 2: ");
        nota2 = entrada.nextDouble();
        System.out.println("Ingrese la nota 3: ");
        nota3 = entrada.nextDouble();
        System.out.println("Ingrese la nota 4: ");
        nota4 = entrada.nextDouble();
        String mensajeFinal = obtenerCualitativo(nota1, nota2, nota3, nota4);
        System.out.println(mensajeFinal);
    }

    public static String obtenerCualitativo(double a, double b, double c, double d) {
        double suma = 0;
        double promedio = 0;
        String cualitativo = "";
        suma = a + b + c + d;
        promedio = suma / 4;
        String cadena="";
        if (promedio >= 0 || promedio <= 5) {
            cualitativo = "Regular";
        } else {
            if (promedio >= 5.1 || promedio <= 8) {
                cualitativo = "Bueno";
            } else {
                if (promedio >= 8.1 || promedio <= 9) {
                    cualitativo = "Muy Bueno";
                } else {
                    if (promedio >= 9.1 || promedio <= 10) {
                        cualitativo = "Sobresaliente";
                    } else {
                    }
                }
            }
        }
        cadena=String.format("El promedio de las notas: %.2f , %.2f , %.2f , %.2f es %S", 
                a,b,c,d,cualitativo);
        return cadena;
    }
}
