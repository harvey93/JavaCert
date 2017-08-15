package AbstractFactory;

public class UFOEnemyShip extends EnemyShip{

	EnemyShipFactory shipFactory;
	
	public UFOEnemyShip(EnemyShipFactory shipFactory){
		this.shipFactory = shipFactory;
	}
	
	@Override
	void makeShip() {
		// TODO Auto-generated method stub
		
		weapon = shipFactory.addESGun();
		engine = shipFactory.addESEngine();
		
		
	}
	
	

}
