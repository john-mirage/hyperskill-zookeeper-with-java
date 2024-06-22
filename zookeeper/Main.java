package zookeeper;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the number of the habitat you would like to view:");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            try {
                int index = Integer.parseInt(input);
                if (index >= 0 && index <= Animal.values().length) {
                    System.out.println(Animal.values()[index].getPicture());
                } else {
                    System.out.println("Invalid index");
                }
            } catch (NumberFormatException e) {
                System.out.println("invalid index");
            }
        }
        System.out.println("See you later!");
    }
}
