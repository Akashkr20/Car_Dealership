package car_Dealership;

public class Dealership {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Costumer cust1 = new Costumer();
		cust1.setName("Tom");
		cust1.setAddress("Maseni");
		cust1.setCashOnHand(12000);
		
		Vehicle vehicle = new Vehicle();
		vehicle.setPrice(11000);
		vehicle.setColor("Red");
		vehicle.setModel("Honda");
		
		Employee emp = new Employee();
		
		
		cust1.purchaseCar(vehicle,emp,false);
	}
	
	
}
