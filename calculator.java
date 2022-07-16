import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int proceed, ch, a, b;
        //initiate do-while loop
        do {
            //menu list
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            //getting user choice for arithmetic operations
            System.out.println("Enter the operation to be performed:");
            ch = sc.nextInt();
            //if - else condition
            if (ch > 0 && ch <= 4) {
                //getting inputs for arithmetic operations
                System.out.println("Enter number1: ");
                a = sc.nextInt();
                System.out.println("Enter number2: ");
                b = sc.nextInt();
            } else {
                System.out.println("Try again later..! Your choice must range from 1 to 4");
                break;
            }
            //creating switch case
            switch (ch) {

                case 1://addition
                    int sum = a + b;
                    System.out.println("The value of addition:  " + sum);
                    break;

                case 2://subtraction
                    int diff = a - b;
                    System.out.println("The value of subtraction:  " + diff);
                    break;

                case 3://multiplication
                    int mul = a * b;
                    System.out.println("The value of product:  " + mul);
                    break;

                case 4://division
                    if (b != 0) {
                        int div = a / b;
                        System.out.println("The value of quotient:  " + div);
                    } else {
                        System.out.println("error! denominator cannot be 0");
                    }
                    break;

            }
            System.out.println("do you want to proceed? 1.yes  2.no ");
            proceed = sc.nextInt();
            //user preference to proceed or exit the program
            if (proceed == 1) {
                System.out.println("continue your process!");
            } else {
                System.out.println("you are Exited..!");
            }
        } while (proceed == 1); //do-while checks the condition
    }

}