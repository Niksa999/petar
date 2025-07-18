package warShip;

public class SmallShip extends BattleShip{
	
	
	public SmallShip() {
	setDamage(100);
	setHealt(300);
	}
	

	@Override
	public String toString() {
		return "Health - "+getHealt()+" -> Small Ship";
	}
}
