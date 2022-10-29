/*
* The program gets a a vehicle
* and it calculates the stats.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-17
*
* This is a Vehicle program
*/

import java.util.Scanner;
/**
 * This is the main CarStatus Class.
 * Class CarStatus
 */
final class Main {

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {


        final Scanner firstInput = new Scanner(System.in);
        final Scanner secondInput = new Scanner(System.in);
        final Scanner thirdInput = new Scanner(System.in);

        try { 
           

        System.out.print("Enter your Side A: ");
        final int sideA = firstInput.nextInt();
        System.out.print("Enter your Side B: ");
        final int sideB = secondInput.nextInt();
        System.out.print("Enter your Side C: ");
        final int sideC = thirdInput.nextInt();

        if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
            System.out.println("Invalid Input, Number to small!");
        } else if (sideA + sideB < sideC || sideB + sideC <= sideA || sideA + sideC <= sideB) {
            System.out.println("Invalid Input, To long.");
        } else {

        // this is a triangle program
        System.out.println("This is a triangle Program!");
        final Triangle triangle = new Triangle(sideA, sideB, sideC);


        System.out.println("Accelerating, 10 of power for 10 sec.");
        triangle.triangleName(sideA, sideB, sideC);
        System.out.println(triangle.getShape());

}
    } catch (java.util.InputMismatchException ex) {
        System.out.println("Invalid Input");
    }

    }
}
