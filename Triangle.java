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
    private int sideA;

    /**
     * This is the second side.
     */
    private int sideB;

    /**
     * This is the third side.
     */
    private int sideC;

    private String shape;

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
        int sideA, 
        int sideB,
        int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }


    public String triangleName(int sideA, int sideB, int sideC) {
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
    /**
     * This returns the licensePlate.
     *
     * @return this returns the licensePlate.
     */
    public String getShape() {
        return this.shape;
    }
}
