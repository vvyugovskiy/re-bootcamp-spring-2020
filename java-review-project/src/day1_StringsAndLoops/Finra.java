package src.day1_StringsAndLoops;

public class Finra {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {

            String print = "";

            if (i % 3 == 0) print = "FIN";
            if (i % 5 == 0) print += "RA";

            if (print.isEmpty()) {
                System.out.println(i);
            } else {
                System.out.println(print);
            }
        }

        System.out.println("count java :: " + javaCount(" hello java he java llo java"));

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");



    }

    public static int javaCount(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 4).equalsIgnoreCase("java")) {
                count++;
                i += 4;
            }
        }

        return count;
    }

}

