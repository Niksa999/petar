package warShip;

public class BattleShip extends Ship{
	
	
	private int damage;
	
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	void attack(Ship ship) {
		if(ship.getHealt() <= 0) {
			System.out.println("Brod je unisten");
			setHealt(0);
			return;
		}else {
		ship.setHealt(ship.getHealt()-damage);
		}
	}
	@Override
	public String toString() {
		return "Health - "+getHealt()+" -> Battle Ship";
	}
	
}
