package game;

import java.util.Random;
import java.util.Scanner;

public class Game {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Code c = new Code();
        Random random = new Random();
        StringBuilder randomString = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            int randomInt = random.nextInt(8); 
            randomString.append(String.valueOf(randomInt));
        }
        String goal = randomString.toString();

        boolean t = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter your try");
            c.setAttempt(input.next());

            for (int j = 0; j < 4; j++) {
                if (c.getAttempt().charAt(j) == goal.charAt(j)) {
                    System.out.println(goal.charAt(j) + " is found in the correct place");
                } else {
                    for (int k = 0; k < 4; k++) {
                        if (c.getAttempt().charAt(k) == goal.charAt(j)) {
                            System.out.println(goal.charAt(j) + " is found but not in the correct place");
                            break;
                        }
                    }
                }
            }

            if (c.getAttempt().equals(goal)) {
                t = true;
            }

            if (t) {
                System.out.println("Congratulations! You guessed the code.");
                break;
            } else {
                System.out.println("Sorry, you didn't guess the code.");
            }
        }
    }
}
