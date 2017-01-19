/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendario;

/**
 *
 * @author dam1a14
 */
import javax.swing.JOptionPane;

public class Calendario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][][] = new int[12][5][7];
        int m; //mesos
        int s; //setmanas
        int d; //dias
        int almacenar = 1;

        for (m = 1; m <= 12; m++) {
            almacenar = 0;

            for (s = 1; s <= 5; s++) {

                for (d = 1; d <= 7; d++) {
                    if (almacenar < 31) {
                        a[m - 1][s - 1][d - 1] = almacenar;
                        almacenar++;
                    }
                }

            }
        }

        for (m = 1; m <= 12; m++) {

            for (s = 1; s <= 5; s++) {

                for (d = 1; d <= 7; d++) {
                    System.out.print(a[m - 1][s - 1][d - 1] + " ");
                }
                System.out.println("");

            }
            System.out.println("");
        }
    }

}
