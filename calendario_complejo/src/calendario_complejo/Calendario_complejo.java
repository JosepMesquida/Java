package calendario_complejo;

public class Calendario_complejo {

    public static void main(String[] args) {
        Integer calendar[][][] = new Integer[12][5][7];

        int dayOfMonth = 1;

        for (int m = 0; m < calendar.length; m++) {
            for (int s = 0; s < calendar[m].length; s++) {
                for (int d = 0; d < calendar[m][s].length; d++) {
                    calendar[m][s][d] = dayOfMonth;
                    if (endOfMonth(dayOfMonth, m + 1)) {
                        break;
                    }
                    dayOfMonth++;
                }
            }
            dayOfMonth = 1;
        }

        print(calendar);

    }

    private static boolean endOfMonth(Integer day, Integer month) {
        if (day == 28 && month == 2) {
            return true;
        }
        if (month < 8 && month % 2 == 0 && day == 30) {
            return true;
        }
        if (month > 8 && month % 2 != 0 && day == 30) {
            return true;
        }
        if (day == 31) {
            return true;
        }
        return false;
    }

    private static void print(Integer[][][] calendar) {
        for (int m = 0; m < calendar.length; m++) {
            for (int w = 0; w < calendar[m].length; w++) {
                for (int d = 0; d < calendar[m][w].length; d++) {
                    Integer dayOfMonth = calendar[m][w][d];

                    if (dayOfMonth != null) {
                        if (dayOfMonth < 10) {
                            System.out.print(" ");
                        }
                        System.out.print(calendar[m][w][d]);
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
