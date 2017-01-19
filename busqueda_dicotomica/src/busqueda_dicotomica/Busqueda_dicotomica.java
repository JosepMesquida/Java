package busqueda_dicotomica;

import javax.swing.JOptionPane;

public class Busqueda_dicotomica {

    public static void main(String[] args) {
        int a[] = {2, 8, 10, 15, 16, 20, 25, 30, 50, 190, 200, 300, 400, 401, 440, 450, 460, 470, 490, 500};
        String numero = JOptionPane.showInputDialog("Introdueix el número que vols cercar");
        int target = Integer.parseInt(numero);
        int derecha = a.length;
        int izquierda = 0;
        int pivote = pivote = (a.length - 1) / 2;

        while (a[pivote] != target) {

            if (target < a[pivote]) {
                derecha = pivote;
            } else {
                izquierda = pivote;
            }
            pivote = (derecha + izquierda) / 2;

            if (izquierda == pivote || derecha == pivote) {
                System.out.println("El número no existe");
                break;
            }
        }
        if (target == a[pivote]) {
            System.out.println(a[pivote] + " esta en la posición de memória nº" + pivote);
        }
    }
}
