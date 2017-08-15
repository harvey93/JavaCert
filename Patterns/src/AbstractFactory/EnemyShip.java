package AbstractFactory;

public abstract class EnemyShip {
	
	private String name;
	ESWeapon weapon;
	ESEngine engine;
	
	
	abstract void makeShip();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
