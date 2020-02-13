import java.util.Scanner;

public class SphereVolume {
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("This program calculates the volume of a sphere.");
		System.out.println("Enter a diameter for a sphere");
		double diam = input.nextDouble();
		
		double radius = ( (diam / 2.0) );
		double volume = ((4.0/3.0) * Math.PI * (radius * radius * radius));
		
		System.out.println("The volume of your sphere is " + volume);
	}
}
