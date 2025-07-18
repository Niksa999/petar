package warShip;

public class Cargo extends Ship{
	

	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	

	@Override
	public String toString() {
		return "Health - "+getHealt()+" , kapacitet - "+getCapacity()+getSpped()+ " -> Cargo Ship";
	}

}
