package bullscows;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, enter the secret code's length:");

        int n;
        while (true) {

            n = sc.nextInt();

            if (n <= 10) {
                break;
            } else {
                System.out.println("Error: can't generate a secret number with a length of" + n
                        + " because there aren't enough unique digits.");
                System.out.println("Please enter the length again:");
            }
        }

        sc.nextLine();

        String secretCode = generateRandomNumber(n);

        System.out.println("Okay, let's start a game!");

        int turn = 1;

        while (true) {

            int bulls = 0;
            int cows = 0;

            System.out.println("Turn " + turn++ + ":");

            String userCode = sc.nextLine();

            if (userCode.equals(secretCode)) {
                System.out.println("Grade: " + n + " bulls");
                break;
            }

            for (int i = 0; i < secretCode.length(); i++) {

                if (secretCode.charAt(i) == userCode.charAt(i)) {
                    bulls++;
                } else if (secretCode.contains(String.valueOf(userCode.charAt(i)))) {
                    cows++;
                }
            }

            String bullsStr = bulls > 1 ? "bulls" : "bull";
            String cowsStr = cows > 1 ? "cows" : "cow";

            if (bulls == 0 && cows == 0) {
                System.out.println("Grade: None.");
            } else if (bulls > 0 && cows == 0) {
                System.out.println("Grade: " + bulls + " " + bullsStr);
            } else if (cows > 0 && bulls == 0) {
                System.out.println("Grade: " + cows + " " + cowsStr);
            } else if (cows > 0 && bulls > 0) {
                System.out.println("Grade: " + bulls + " " + bullsStr + " and " + cows + " " + cowsStr);
            }
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }

    private static String generateRandomNumber(int length) {

        String randomNumber = "";
        Random r = new Random();

        while (randomNumber.length() < length) {

            int temp = r.nextInt(9 - 0 + 1) + 0;

            if (randomNumber.length() < length && !randomNumber.contains(String.valueOf(temp))) {

                randomNumber += String.valueOf(temp);
            }
        }
        System.out.println(randomNumber);
        return randomNumber;
    }
}

//        String preCode = "9305";
//        int cows = 0;
//        int bulls = 0;
//
//        Scanner sc = new Scanner(System.in);
//
