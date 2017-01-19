package array_bidimencional_producto;

public class array_bidimencional_producto {

    public static void main(String[] args) {
        int matriz1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int matriz2[][] = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int matriz3[][] = new int[3][4];

        for (int i = 0; i <= 2; i++) {
            System.out.println(" ");
            for (int x = 0; x <= 3; x++) {
                matriz3[i][x] = matriz1[i][0] * matriz2[0][x] + matriz1[i][1] * matriz2[1][x];
                System.out.print(" " + matriz3[i][x]);
            }
        }
        System.out.println();

    }
}
