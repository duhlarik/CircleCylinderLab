package circleCylinderLab;

import java.util.Scanner;

public class mainCircleCylinder {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);

		System.out.println("This app will figure the area of a circle, and the area & volume of a cylinder.");

		String choice = "yes";

		while (choice.equalsIgnoreCase("yes")) {

			System.out.println("Enter the radius of the circle: ");

			double radius = scan1.nextDouble();
			scan1.nextLine();

			Circle c1 = new Circle(radius);

			double area = c1.getArea();

			System.out.println("Area of the circle: " + area);

			Cylinder cyl1 = new Cylinder(radius);

			double cyl1Volume = cyl1.getVolume();

			System.out.println("Volume of the cylinder at 1 inch: " + cyl1Volume);

			double cylArea = cyl1.getCylinderArea();

			System.out.println("Area of the cylinder at 1 inch: " + cylArea);
			
			String answer = "yes";
					
			System.out.println("Do you want to change the height of the cylinder?");
			
			answer = scan1.nextLine();
			
			Cylinder cyl2 = new Cylinder(radius);

			while (answer.equalsIgnoreCase("yes")) {
				
				System.out.println("Enter the height of the cylinder: ");
				
				double height = scan1.nextDouble();
				scan1.nextLine();

				cyl2.setHeight(height);

				double cyl2Area = cyl2.getCylinderArea();

				double cyl2Volume = cyl2.getVolume();

				System.out.println("Cylinder volume at " + height + " inches: " + cyl2Volume);

				System.out.println("Cylinder area at " + height + " inches: " + cyl2Area);

				System.out.println("Do you want to enter another height? ");

				answer = scan1.nextLine();

			}

			System.out.println("Enter another circle radius?");

			choice = scan1.nextLine();
		}

	}

}
