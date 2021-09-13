/* Create a menu that prints a welcome message like so
Counter Program. Please choose an action:

    1.Count Up
    2.Count Down

User should be able to select either 1 or 2, and quit to exit program.
    also user should be able to input the start and stop value to be counted
    if either is selected call the corresponding method (countTo/countBack)

    * */

import java.util.Scanner;

public class Main {

    Counter counter = new Counter();
    Scanner scanner = new Scanner(System.in);
    Scanner intScanner = new Scanner(System.in);//it is advised to use separate scanner for INT values because of a bug

    public static void main(String[] args) {
        Main main = new Main();
        main.showMenu();
    }
        void showMenu() {
            String userInput;
            do {
                System.out.println("\nCounter Program. Please choose an action::");
                System.out.println("1. Count Up");
                System.out.println("2. Count Down");
                System.out.println("\nEnter Quit to end program...");
                userInput = scanner.nextLine();
                switch (userInput) {
                    case "Quit", "QUIT", "quit":
                        System.out.println("Exiting Application...");
                        break;
                    case "1":
                        countUp();
                        break;
                    case "2":
                        countDown();
                    default:
                        break;
                }
            } while (!userInput.equalsIgnoreCase("Quit")); //if NOT "quit" (!=not) the app will run all over again
        return;
        }

        void countUp() {
            System.out.println("Enter the start number: ");
        int enterStart = intScanner.nextInt();
            System.out.println("Enter the end number: ");
            int enterStop = intScanner.nextInt();
            System.out.println("Counting " + enterStart + " to " + enterStop);
        counter.countTo(enterStart, enterStop);
        }
        void countDown() {
            System.out.println("Enter the start number: ");
            int enterStart = intScanner.nextInt();
            System.out.println("Enter the end number: ");
            int enterStop = intScanner.nextInt();
            System.out.println("Counting " + enterStart + " to " + enterStop);
            counter.countBack(enterStart, enterStop);
        }
    }

