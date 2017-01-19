/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bucle_while;

/**
 *
 * @author dam1a14
 */
public class bucle_while {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int i = 0;
        while (true) {          //Condición trivial: siempre cierta
            i++;
            System.out.println("Valor de i: " + i);
            if (i == 9) {
                break;
            }
        }
    }

}
