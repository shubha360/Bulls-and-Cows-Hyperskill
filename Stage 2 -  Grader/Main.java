package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String preCode = "9305";
        int cows = 0;
        int bulls = 0;

        Scanner sc = new Scanner(System.in);

        String userCode = sc.nextLine();

        for (int i = 0; i < 4; i++) {

            if (preCode.charAt(i) == userCode.charAt(i)) {
                bulls++;
            } else if (preCode.contains(String.valueOf(userCode.charAt(i)))) {
                cows++;
            }
        }

        if (bulls == 0 && cows == 0) {
            System.out.println("Grade: None. The secret code is " + preCode + ".");
        } else if (bulls > 0 && cows == 0) {
            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + preCode + ".");
        } else if (cows > 0 && bulls == 0) {
            System.out.println("Grade: " + cows + " cow(s). The secret code is " + preCode + ".");
        } else if (cows > 0 && bulls > 0) {
            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + preCode + ".");
        }
    }
}
