package warShip;

public class BigShip extends BattleShip{
	
	public BigShip() {
	setDamage(100);
	setHealt(300);
	}

	@Override
	public String toString() {
		return "Health - "+getHealt()+" -> Big Ship";
	}

	
}
