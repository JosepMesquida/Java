/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_bucle_100;

/**
 *
 * @author dam1a14
 */
public class Array_bucle_100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i; // Es mostra per pantalla

        int[] array = new int[100];

        for (i = 0; i <= 99; i++) {

            (array[i]) = i; // Descleram que l'array es igual a i 

            System.out.println(array[i]);
        }
    }

}
