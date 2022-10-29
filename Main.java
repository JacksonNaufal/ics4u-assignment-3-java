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

            System.out.println("Enter your triangles sides(cm)");
            System.out.print("Enter your first side: ");
            final double sideA = firstInput.nextInt();
            System.out.print("Enter your second side: ");
            final double sideB = secondInput.nextInt();
            System.out.print("Enter your third side: ");
            final double sideC = thirdInput.nextInt();

            if (sideA <= 0 || sideB <= 0 || sideC <= 0) {
                System.out.println("Invalid Input, Number to small!");
            } else if (sideA + sideB <= sideC || sideB + sideC <= sideA
                            || sideA + sideC <= sideB) {
                System.out.println("Invalid Input, To long.");
            } else {

                // this is a triangle program
                final Triangle triangle = new Triangle(sideA, sideB, sideC);

                triangle.status();

                triangle.triangleName(sideA, sideB, sideC);
                System.out.println("\nThe shape is a " + triangle.getShape());

                System.out.println("");
                System.out.println("The Perimeter and Area are below!");
                triangle.trianglePerimeter(sideA, sideB, sideC);
                System.out.println("\nThe perimeter is "
                                + triangle.getPerimeter() + "cm");

                triangle.triangleArea(sideA, sideB, sideC);
                System.out.println("The area is " + triangle.getArea() + "cm²");

                System.out.println("");
                System.out.println("The angles are below!");
                triangle.angleA(sideA, sideB, sideC);
                System.out.println("Angle A is " +triangle.getAngleA() + "°");

                triangle.angleB(sideA, sideB, sideC);
                System.out.println("Angle B is " + triangle.getAngleB() + "°");

                triangle.angleC(sideA, sideB, sideC);
                System.out.println("Angle C is " + triangle.getAngleC() + "°");

            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("Invalid Input");
        }
    System.out.println("\nDone!");
    }
}
