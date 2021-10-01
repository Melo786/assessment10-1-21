package question4;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("What is your lucky number");
        number = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your name");
        String name = scanner.nextLine();

        System.out.println("Your name is Melo and your lucky number is 7");
    }
}
