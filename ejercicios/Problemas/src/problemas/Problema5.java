/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas;

/**
 *
 * @author reroes
 */
public class Problema5 {

    public static void main(String[] args) {
        int[][] informacion = {{1, 2, 3}, {10, 20, 30}, {100, 200, 300}};
        int suma;
        suma = sumaArray(informacion);
        System.out.println(suma);
    }

    public static int sumaArray(int[][] a) {
        int sumar=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sumar=sumar+a[i][j];
            }
        }
        return sumar;
    }
}

