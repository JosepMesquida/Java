package array_bidimencional_sumas;

public class Array_bidimensional_sumas {

    public static void main(String[] args) {
        int mt1[][] = {{1, 2}, {3, 4}};
        int mt2[][] = {{1, 3}, {4, 5}};
        int mt3[][] = new int[2][2];

        for (int i = 0; i <= 1; i++) {
            for (int x = 0; x <= 1; x++) {
                mt3[i][x] = mt2[i][x] + mt1[i][x];
            }
        }
        for (int i = 0; i <= 1; i++) {
            for (int x = 0; x <= 1; x++) {
                System.out.print(mt3[i][x] + " ");
            }
        }

    }
}
