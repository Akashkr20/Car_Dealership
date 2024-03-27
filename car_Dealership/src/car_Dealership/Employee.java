package car_Dealership;

public class Employee {
	
	public void handleCostumers(Costumer cust,Vehicle vehicle,boolean finance) {
		if(finance == true) {
			double loanAmount = vehicle.getPrice() - cust.getCashOnHand();
			runCreditHistory(cust,loanAmount);
		}
		else if(vehicle.getPrice() <= cust.getCashOnHand()) {
			processTransaction(cust,vehicle);
		}
		else {
			System.out.println("Costumer need more money to purchase this "+vehicle);
		}
	}

	private void runCreditHistory(Costumer costumer,Double loanAmount) {
		// TODO Auto-generated method stub
		System.out.println("Run Credit History....");
		System.out.println("Able to purcahse car...");
	}
	public void processTransaction(Costumer custumer,Vehicle vehicle) {
		System.out.println("Costumer has purchased the vehicle.."+vehicle+"..for the price...." +vehicle.getPrice());
	}
}
