/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucles;

/**
 *
 * @author dam1a14
 */
public class bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int x = 0;
        int y = 0;
        int acumulador = 0;
        int resultado = 0;
        int suma = 0;

        for (i = 0; i <= 100; i++) {
            acumulador = acumulador + i;
        }
        System.out.println("bucle de for: " + i + " " + acumulador);

        while (x < 100) {
            x++;
            resultado = resultado + x;
        }
        System.out.println("bucle de while: " + x + " " + resultado);

        do {
            y++;
            suma = suma + y;
        } while (y < 100);
        System.out.println("bucle de do while: " + y + " " + suma);
    }

}
