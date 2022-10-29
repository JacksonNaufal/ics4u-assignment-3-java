/*
* This is a program that gets the Vehicle status
* from Vehicle to carStatus
*
* @author  Jackson Naufal
* @version 1.0
* @since   2022-10-24
*/

import java.lang.Math;
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

    private String shape;

    private double perimeter = 0;

    private double semiperimeter = 0;

    private double area = 0;

    private double topSideA = 0;

    private double topSideB = 0;

    private double topSideC = 0;

    private double angleOne = 0;

    private double angleTwo = 0;

    private double angleThree = 0;

    private static final double TRIANGLEDEGREE = 180;

    private static final double DEGREE = 3.14;

    private static final String HERE = "true";

    /**
     * This is the Vehicle Constructor.
     *
     * @param color The vehicles color.
     * @param licensePlate The vehicles license plate.
     * @param doorNum The vehicles number of doors.
     * @param maxSpeed The vehicles max speed.
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


    public String triangleName(double sideA, double sideB, double sideC) {
        if (sideA == sideB && sideB == sideC) {
            return (this.shape = "Equilateral Triangle");
        } else if (sideA == sideB || sideB == sideC || sideA == sideC) {
            return (this.shape = "Isoceles Triangle!");
        } else if  (
            sideA * sideA + sideB * sideB == sideC * sideC ||
            sideC * sideC + sideB * sideB == sideA * sideA ||
            sideC * sideC + sideA * sideA == sideB * sideB
        ) { 
            return (this.shape = "Right Angle Triangle!");
        } else {
            return (this.shape = "Scalene Triangle!");
    }
    }

    public void trianglePerimeter(double sideA, double sideB, double sideC) {
        this.perimeter = sideA + sideC + sideB;
    }

    public void triangleArea(double sideA, double sideB, double sideC) {
         this.semiperimeter = (sideA + sideB + sideC) / 2;

         this.area = Math.sqrt(this.semiperimeter * (this.semiperimeter - sideA) * (this.semiperimeter - sideB) * (this.semiperimeter - sideC));       
    }

    public void angleA(double sideA, double sideB, double sideC) {

    this.topSideA = sideA * sideA;
    this.topSideB = sideB * sideB;
    this.topSideC = sideC * sideC;

    this.angleOne = Math.acos((this.topSideB + this.topSideC - this.topSideA) / (2 * sideB * sideC)) * (TRIANGLEDEGREE / DEGREE);

    }

    public void angleB(double sideA, double sideB, double sideC) {

        this.topSideA = sideA * sideA;
        this.topSideB = sideB * sideB;
        this.topSideC = sideC * sideC;

        this.angleTwo = Math.acos((this.topSideA + this.topSideC - this.topSideB) / (2 * sideA * sideC)) * (TRIANGLEDEGREE / DEGREE);
    }

    public void angleC(double sideA, double sideB, double sideC) {

        this.topSideA = sideA * sideA;
        this.topSideB = sideB * sideB;
        this.topSideC = sideC * sideC;

        this.angleThree =
          Math.acos((this.topSideB + this.topSideA - this.topSideC) / (2 * sideB * sideA)) * (TRIANGLEDEGREE / DEGREE);
    }

    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getShape() {
        return this.shape;
    }
    
    public double getPerimeter() {
        return this.perimeter;
    }

    public double getArea() {
        return this.area;
    }

    public double getAngleA() {
         return this.angleOne;
    }

    public double getAngleB () {
         return this.angleTwo;
    } 

    public double getAngleC() {
        return this.angleThree;
    }

    public void status() {
        System.out.println("\nIs triangle Valid:" + this.HERE);
        System.out.println("The three sides were");
        System.out.println("Side A --->" + this.sideA);
        System.out.println("Side B --->" + this.sideB);
        System.out.println("Side C --->" + this.sideC);
    }
}
