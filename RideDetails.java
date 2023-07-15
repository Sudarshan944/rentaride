import java.util.*;
public class CarRent {
	public static void main(String[] args) {
		double distance;
		String carName;	
		Scanner scan = new Scanner(System.in);
		System.out.print("Customer Ride Distance:");
		distance=scan.nextDouble();
		System.out.print("Car Requested:");
		carName=scan.next();
		System.out.println("List of Drivers with Details:");
		Car c = new Car();
		c.findClosest(distance, carName);
		c.EstimateCost(distance);
		scan.close();
	}
}
