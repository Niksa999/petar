package warShip;

public class Ship {

	private int health;
	private int speed;
	
	
	public int getHealt() {
		return health;
	}
	public void setHealt(int healt) {
		this.health = healt;
	}
	public int getSpped() {
		return speed;
	}
	public void setSpped(int spped) {
		this.speed = spped;
	}
	
	void getDamage(int damage) {
		if(health - damage <= 0) {
			System.out.println("Brod unisten");
			setHealt(0);
			return;
		}
		else {
		health = health - damage;
		}
		
	}
	
	@Override
	public String toString() {
		return "Health - "+health;
	}
	
}
