package array_ordenacion;

public class Array_ordenacion {

    public static void main(String[] args) {
        int array[] = {8, 2, 5, 3, 4, 1};
        int i;
        int x;
        int volcado;

        for (i = 0; i < array.length; i++) {
            for (x = i + 1; x < array.length; x++) {
                if (array[i] > array[x]) {
                    volcado = array[i];
                    array[i] = array[x];
                    array[x] = volcado;
                }

            }
        }
    }
}
