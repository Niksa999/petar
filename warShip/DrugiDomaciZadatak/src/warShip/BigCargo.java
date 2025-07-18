package warShip;

public class BigCargo extends Cargo{
	
	
	private int shield;
	
	
	public int getShield() {
		return shield;
	}


	public void setShield(int shield) {
		this.shield = shield;
	}


	public BigCargo() {
		setHealt(200);
		setCapacity(5000);
		setShield(10);
	}
	@Override
	void getDamage(int damage) {
		if(getHealt()-damage+getShield() <= 0) {
			System.out.println("Brod unisten");
			setHealt(0);
			return;
		}
		else {
			setHealt(getHealt()-damage+shield);
		}
	}
	
	@Override
	public String toString() {
		return "Health - "+getHealt()+" , kapacitet - "+getCapacity()+" , shield - "+shield+" -> Big Cargo";
	}
}
