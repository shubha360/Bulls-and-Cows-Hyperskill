package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("Error: can't generate a secret number with a length of" + n
                    + " because there aren't enough unique digits.");
        } else {

            String randomNumber = "";

            while (randomNumber.length() < n) {

                String rand = String.valueOf(System.nanoTime());

                for (int i = 0; i < rand.length(); i++) {

                    if (randomNumber.length() < n && !randomNumber.contains(String.valueOf(rand.charAt(i)))) {

                        randomNumber += rand.charAt(i);
                    }
                }
            }
            System.out.println("The random secret number is " + randomNumber + ".");
        }
    }
}

//        String preCode = "9305";
//        int cows = 0;
//        int bulls = 0;
//
//        Scanner sc = new Scanner(System.in);
//
//        String userCode = sc.nextLine();
//
//        for (int i = 0; i < 4; i++) {
//
//            if (preCode.charAt(i) == userCode.charAt(i)) {
//                bulls++;
//            } else if (preCode.contains(String.valueOf(userCode.charAt(i)))) {
//                cows++;
//            }
//        }
//
//        if (bulls == 0 && cows == 0) {
//            System.out.println("Grade: None. The secret code is " + preCode + ".");
//        } else if (bulls > 0 && cows == 0) {
//            System.out.println("Grade: " + bulls + " bull(s). The secret code is " + preCode + ".");
//        } else if (cows > 0 && bulls == 0) {
//            System.out.println("Grade: " + cows + " cow(s). The secret code is " + preCode + ".");
//        } else if (cows > 0 && bulls > 0) {
//            System.out.println("Grade: " + bulls + " bull(s) and " + cows + " cow(s). The secret code is " + preCode + ".");
//        }