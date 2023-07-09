
  
public class CarInformation {
	
		char[] driver = { 'A', 'B', 'C','D', 'E' };
		String[] carmodel = { "Sedan", "HatchBack", "5Seater", "Sedan", "HatchBack" };
		double[] rating = { 4, 4.3, 4.8, 4.1, 4.7 };
		int[] distance = { 500, 1, 200, 700, 430 };
		public void CarInformations() {
		System.out.println("List of Drivers with Details: ");
		System.out.println("Driver" + "Car Model" + "Rating" + "DistanceFromCustomer");
		for (int i = 0; i < 5; i++) {
			System.out.println(" "+driver[i] +" "+ carmodel[i]+" " + rating[i]+" " + distance[i]);

		}

	}

}

