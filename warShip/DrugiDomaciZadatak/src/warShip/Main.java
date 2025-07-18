package warShip;

public class Main {

	public static void main(String[] args) {

		SmallShip smallShip = new SmallShip();
		BigShip bigShip = new BigShip();
		CommandShip commandShip =  new CommandShip();
		SmallCargo smallCargo = new SmallCargo();
		BigCargo bigCargo = new BigCargo();
		Cargo cargo = new Cargo();
		
		
		
		System.out.println(smallShip);// prikaz karakteristika broda smallShip prije napada
		bigShip.attack(smallShip);	// prikaz napada broda bigShip
		System.out.println(smallShip); // prikaz karakteristika broda smallShip nakon napda 
		
		
		
		System.out.println(commandShip); // prikaz karakteristika broda commandShip
		commandShip.getDamage(smallShip.getDamage()); //prikaz odbrane commandShip sa shield od smallShip
		System.out.println(commandShip); // prikaz karakteristika broda commandShip nakon odbrane 

	
		System.out.println(bigCargo); // prikaz karakteristika broda bigCargo
		bigCargo.getDamage(bigShip.getDamage());//prikaz odbrane bigShip
		System.out.println(bigCargo);// prikaz karakteristika broda bigCargo nakon odbrane
		bigShip.attack(bigCargo);// prikaz unistavanja broda bigCargo sa vise napada
		bigShip.attack(bigCargo);
		bigShip.attack(bigCargo);
		System.out.println(bigCargo);
		
		System.out.println(smallCargo); // prikaz karakteristika broda smallCargo
		System.out.println(smallShip); // prikaz karakteristika broda smallShip
		smallCargo.getDamage(smallShip.getDamage());//prikaz unistvanja broda smallCargo
		System.out.println(smallCargo);
		
		
	}

}
