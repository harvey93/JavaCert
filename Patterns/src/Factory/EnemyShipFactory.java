package Factory;

public class EnemyShipFactory {
	

	public EnemyShip makeEnemyShip(String newShipType){
		EnemyShip ship = null;
		
		if(newShipType == "U"){
			ship = new UFOEnemyShip();
		}else if(newShipType == "R"){
			ship = new RocketEnemyShip();
		}else if(newShipType == "BU"){
			ship = new BigUFOEnemyShip();
		}
		return ship;
	}
}
