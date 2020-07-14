// Code reviewed by @professorgordon
/* Brian Munro
 * CSIS 1400 - Summer 2020
 * Week 4 Assignment
 */

//import scanner for user input
import java.util.Scanner;

public class Week4Assignment {

	public static void main(String[] args) {
		// instantiate new scanner object
		Scanner input = new Scanner(System.in);
		
		//create variables for length, width, height
		double length;
		double width;
		double height;
		
		//Have user enter box dimensions.
		System.out.println("This program will calculate the surface area and volume of a box based on your dimensions.");
		System.out.print("Enter box length: ");
		length = input.nextDouble();
		System.out.print("\nEnter box width: ");
		width = input.nextDouble();
		System.out.print("\nEnter box height: ");
		height = input.nextDouble();
		System.out.printf("Length: %.2f\nWidth: %.2f\nHeight: %.2f\n", length, width, height);
		
		//Call method for surface area and print result
		double boxSurfaceArea = surfaceArea(length, width, height);
		System.out.printf("The surface area is: %,.2f\n", boxSurfaceArea);
		
		//Call method for volume and print result
		double boxVolume = volume(length, width, height);
		System.out.printf("The volume is: %,.2f\n", boxVolume);
		
		

	}

	private static double volume(double length, double width, double height) {
		//calculate box volume
		double volume = length*width*height;
		return volume;
	}

	private static double surfaceArea(double l, double w, double h) {
		//calculate surface area
		double surfaceArea = 2*l*w + 2*l*h + 2*w*h;
		return surfaceArea;
	}

}
