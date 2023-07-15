import java.util.Scanner;

public class Car {
	char[] driver = {'A','B','C','D','E'};
	String[] car_model= {"Sedan","Hatchback","5-Seater","Sedan","Hatchback"};
	double[] rating = {4,4.3,4.8,4.1,4.7};
	double[] distance = {0.5,1,0.2,0.7,0.43};
	public void CarInfo(){
	System.out.println("List of Drivers with Details:");
	boolean iskm=true;
	System.out.println("Driver\t\t"+"CarModel\t\t"+"Rating\t\t"+"Distance From Customer");
		for(int i=0;i<driver.length;i++) {
			iskm=true;
			if (distance[i]<1) {
				distance[i]*=1000;
				iskm=false;
			}
			System.out.print(driver[i]+"\t\t"+car_model[i]+"   \t\t"+rating[i]+"\t\t");
			System.out.print((int)distance[i]);
			if (iskm) {
				System.out.println("km");
			}else {
				System.out.println("m");
			}
		}
	}
	public void findClosest(double distance,String carName) {
		int minimum_distance=Integer.MAX_VALUE;
		char driver_selected;
		boolean flag = false;
		boolean choice;
		String destination;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < this.driver.length; i++) {
			if (this.car_model[i].equals(carName)&& this.rating[i] >= 4.0) {
				if (minimum_distance > this.distance[i]) {
					flag=true;
					minimum_distance = (int) this.distance[i];
					driver_selected = this.driver[i];
					System.out.print("Inside city - (1) or any Destination - (2): ");
					choice= sc.nextInt() == 1;
					if(!choice) {
					System.out.print("Destination:");
					destination = sc.next();
					if((driver_selected=='A' && destination.equals("Gurgaon") || destination.equals("Noida")|| destination.equals("Delhi"))||
							(driver_selected=='B' && destination.equals("Gurgaon")) ||
							(driver_selected=='C' && destination.equals("Noida")) ||
							(driver_selected=='D' && destination.equals("Noida")) ||
							(driver_selected=='E' && destination.equals("Delhi")))
							System.out.println("Driver " + driver_selected+ " will get you to the destination");
					else {
						System.out.println("Cannot goto preferred destination");
					}
					}else {
						System.out.println("Driver " + driver_selected+ " will get you to the destination");
					}
				}
			}
		}sc.close();
		if(flag==false) {
			System.out.println("Select some other car");
			this.CarInfo();
		}
	}
	public void EstimateCost(double distance) {
		System.out.println("Your charge will be Rs"+(int)(distance*8));
	}
}
