import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num;
        int selection= 1;
        while (selection == 1) {
            Boolean situation = false;
            System.out.println("Please enter any number what you want to calculate : ");
            Scanner input = new Scanner(System.in);
            num = input.nextInt();

            if (num >= 0) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        situation = false;
                        break;
                    } else {
                        situation = true;
                    }
                }
                if (situation == false) {
                    System.out.println("This number is not a prime number");
                    System.out.println("--------------------------------------");
                    System.out.println("Would you like to try again ??  YES(1)/NO(2)");
                    Scanner pick = new Scanner(System.in);
                    selection = pick.nextInt();
                    System.out.println("--------------------------------------");
                } else {
                    System.out.println("This number is a prime number");
                    System.out.println("--------------------------------------");
                    System.out.println("Would you like to try again ??  YES(1)/NO(2)");
                    Scanner pick = new Scanner(System.in);
                    selection = pick.nextInt();
                    System.out.println("--------------------------------------");
                }
            } else {
                System.out.println("Please enter a number greater than 0");
                System.out.println("--------------------------------------");
                System.out.println("Would you like to try again ??  YES(1)/NO(2)");
                Scanner pick = new Scanner(System.in);
                selection = pick.nextInt();
                System.out.println("--------------------------------------");
            }


        }
    }
}
