     // import the Scanner class
import java.util.Scanner;

public class App {

    // Scanner Object
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        // // Method call
        // int product= multiply();
        // System.out.println("The product is: " + product);

        // // Method call
        // int quotient = divide();
        // System.out.println("The quotient is: " + quotient);

        // Method call
        // String crushName = revealMyCrush();
        // System.out.println(crushName);

        // // Method call
        myOrder();

        // Close scanner
        scan.close();
    }

    static int multiply() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;
    }

    static int divide() {
        System.out.println("Please enter two numbers to divide");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;

    }
        static String revealMyCrush() {
            System.out.println("This will reveal the name of your crush");
            System.out.print("Enter the your name: ");
    
            String myName = scan.nextLine();
    
            System.out.print("Enter the name of your crush: ");
            
            String nameOfMyCrush = scan.nextLine();

            System.out.print("Enter the name of your crush 2: ");

            String nameOfCrush2 = scan.nextLine();
    
            return myName + " loves " + nameOfMyCrush + " and " + nameOfCrush2;
        }

        static void myOrder(){

            System.out.println("Welcome to KFC, what are your orders? ");
            String order1 = scan.nextLine();
            System.out.println("Price: ");
            Double price1 = scan.nextDouble();

            scan.nextLine();

            System.out.println("What is your second order? ");

            String order2 = scan.nextLine();
            System.out.println("Price: ");
            Double price2 = scan.nextDouble();

            scan.nextLine();
            
            System.out.println("What is your third order? ");
            String order3 = scan.nextLine();
            System.out.println("Price: ");
            Double price3 = scan.nextDouble();

            Double total = price1 + price2 + price3;

            System.out.println("I will repeat your order are...:" + order1 + " , " + order2 + ", and " +order3 );
            System.out.println("The total amount is: " + total);



        }
    
 }

   







