/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadrado_asteriscos;

import java.util.Scanner;

/**
 *
 * @author dam1a14
 */
public class cuadrado_asteriscos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner t = new Scanner(System.in);

        int tamanio = 0;
        System.out.println("Dame el tamaño del cuadrado");
        tamanio = t.nextInt();

        for (int i = 1; i <= tamanio; i++) {

            for (int j = 1; j <= tamanio; j++) {
                if (j == 1 || j == tamanio || i == 1 || i == tamanio) {
                    System.out.print("* ");

                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
