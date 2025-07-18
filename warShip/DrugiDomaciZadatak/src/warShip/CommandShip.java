package warShip;

public class CommandShip extends BattleShip{
	
	private int shield;
	
	public CommandShip() {
		setDamage(150);
		setHealt(1000);
		setShield(20);
	}


	public int getShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
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
	return "Health - "+getHealt()+" , shield - "+shield+" "+" -> Command Ship";
	}
}
