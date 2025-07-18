package warShip;

public class SmallCargo extends Cargo{
	
	public SmallCargo() {
		setHealt(100);
		setCapacity(1000);
	}
	
	@Override
	public String toString() {
		return "Health - "+getHealt()+" , kapacitet - "+getCapacity()+" -> Small Cargo";
	}

}
