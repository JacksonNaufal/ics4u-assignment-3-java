/*
* This is a program that gets the Vehicle status
* from Vehicle to carStatus
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-10-24
*/

/**
 * This is the class for Vehicle.
 * Make class Vehicle.
 */

public class Triangle {

    /**
     * This is the first side.
     */
    private double sideA;

    /**
     * This is the second side.
     */
    private double sideB;

    /**
     * This is the third side.
     */
    private double sideC;

    /**
     * This is the shape.
     */
    private String shape;

    /**
     * This is the perimeter.
     */
    private double perimeter;

    /**
     * This is the semiperimeter.
     */
    private double semiperimeter;

    /**
     * This is the area.
     */
    private double area;

    /**
     * This is the topSideA.
     */
    private double topSideA;

    /**
     * This is the topSideB.
     */
    private double topSideB;

    /**
     * This is the topSideC.
     */
    private double topSideC;

    /**
     * This is the angleOne.
     */
    private double angleOne;

    /**
     * This is the angleTwo.
     */
    private double angleTwo;

    /**
     * This is the angleThree.
     */
    private double angleThree;

    /**
     * This is the TRIANGLEDEGREE.
     */
    private final static double TRIANGLEDEGREE = 180;

    /**
     * This is the DEGREE.
     */
    private final static double DEGREE = 3.14;

    /**
     * This is the HERE.
     */
    private final static String HERE = "true";

    /**
     * This is the Triangle Constructor.
     *
     * @param sideA This is the first side.
     * @param sideB This is the second side.
     * @param sideC This is the third side.
     *
     */
    public Triangle(
        double sideA, 
        double sideB,
        double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    /**
     * This is the triangleName function.
     *
     * @param sideA The first side.
     * @param sideB The second side.
     * @param sideC the third side.
     * @return this.shape Returns the shape.
     */
    public String triangleName(double sideA, double sideB, double sideC) {
        if (sideA == sideB && sideB == sideC) {
            return this.shape = "Equilateral Triangle";
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return this.shape = "Isoceles Triangle!";
        } else if  (
            sideA * sideA + sideB * sideB == sideC * sideC ||
            sideC * sideC + sideB * sideB == sideA * sideA ||
            sideC * sideC + sideA * sideA == sideB * sideB
        ) {
            return this.shape = "Right Angle Triangle!";
        } else {
            return this.shape = "Scalene Triangle!";
    }
    }

    /**
     * This is the trianglePerimeter.
     *
     * @param sideA The first side.
     * @param sideB The second side.
     * @param sideC the third side.
     */
    public void trianglePerimeter(double sideA, double sideB, double sideC) {
        this.perimeter = sideA + sideC + sideB;
    }

     /**
     * This is the triangleArea.
     *
     * @param sideA The first side.
     * @param sideB The second side.
     * @param sideC the third side.
     */
    public void triangleArea(double sideA, double sideB, double sideC) {
         this.semiperimeter = (sideA + sideB + sideC) / 2;

         this.area = Math.sqrt(this.semiperimeter * (this.semiperimeter - sideA) * (this.semiperimeter - sideB) * (this.semiperimeter - sideC));       
    }

    /**
     * This is the angleA.
     *
     * @param sideA The first side.
     * @param sideB The second side.
     * @param sideC the third side.
     */
    public void angleA(double sideA, double sideB, double sideC) {

    this.topSideA = sideA * sideA;
    this.topSideB = sideB * sideB;
    this.topSideC = sideC * sideC;

    this.angleOne = Math.acos((this.topSideB + this.topSideC - this.topSideA) / (2 * sideB * sideC)) * (TRIANGLEDEGREE / DEGREE);

    }

    /**
     * This is the angleB.
     *
     * @param sideA The first side.
     * @param sideB The second side.
     * @param sideC the third side.
     */
    public void angleB(double sideA, double sideB, double sideC) {

        this.topSideA = sideA * sideA;
        this.topSideB = sideB * sideB;
        this.topSideC = sideC * sideC;

        this.angleTwo = Math.acos((this.topSideA + this.topSideC - this.topSideB) / (2 * sideA * sideC)) * (TRIANGLEDEGREE / DEGREE);
    }

    /**
     * This is the angleC.
     *
     * @param sideA The first side.
     * @param sideB The second side.
     * @param sideC the third side.
     */
    public void angleC(double sideA, double sideB, double sideC) {

        this.topSideA = sideA * sideA;
        this.topSideB = sideB * sideB;
        this.topSideC = sideC * sideC;

        this.angleThree =
          Math.acos((this.topSideB + this.topSideA - this.topSideC) / (2 * sideB * sideA)) * (TRIANGLEDEGREE / DEGREE);
    }

    /**
     * This returns the Shape.
     *
     * @return this returns the shape.
     */
    public String getShape() {
        return this.shape;
    }
   
    /**
     * This returns the getPerimeter.
     *
     * @return this returns the getPerimeter.
     */
    public double getPerimeter() {
        return this.perimeter;
    }

    /**
     * This returns the getArea.
     *
     * @return this returns the getArea.
     */
    public double getArea() {
        return this.area;
    }

    /**
     * This returns the getAngleOne.
     *
     * @return this returns the getAngleOne.
     */
    public double getAngleA() {
         return this.angleOne;
    }

    /**
     * This returns the getAngleB.
     *
     * @return this returns the getAngleB.
     */
    public double getAngleB () {
         return this.angleTwo;
    } 

    /**
     * This returns the getAngleC.
     *
     * @return this returns the getAngleC.
     */
    public double getAngleC() {
        return this.angleThree;
    }

    /**
     * This is the status.
     */
    public void status() {
        System.out.println("\nIs triangle Valid:" + this.HERE);
        System.out.println("The three sides were");
        System.out.println("Side A --->" + this.sideA);
        System.out.println("Side B --->" + this.sideB);
        System.out.println("Side C --->" + this.sideC);
    }
}
