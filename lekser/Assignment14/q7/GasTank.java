package Assignment14.q7;

public class GasTank {

	double amount = 0;
	double capacity;

	
	public GasTank(double capacity) {
		this.capacity = capacity;
	}
	
	public void addGas(double addFuel) {
		if ((amount + addFuel) > capacity ) {
			amount= capacity;
		}
		amount+=addFuel;
	}
	public void useGas(double useFuel) {
		if ((amount - useFuel) < 0 ) {
			amount= 0;
		}
		amount-=useFuel;
	}
	
	public boolean isEmpty() {
		if (amount<0.1) {
			return true;
		}
		return false;
	}
	
	public boolean isfull() {
		if (amount>capacity-0.1) {
			return true;
		}
		return false;
	}
	
	public double gasLevel() {
		return amount;
	}
	
	
	public double fillUp() {
		return capacity-amount;
	}
	
	
	
	
	
}
