package AbstractFactory;


public class UFOShipBuilding extends EnemyShipBuilding{

	protected EnemyShip makeEnemyShip(String typeOfShip) {
		// TODO Auto-generated method stub
		EnemyShip theShip = null;
		
		if(typeOfShip == "UFO"){
			EnemyShipFactory shipPartsFactory = new UFOEnemyShipFactory();
			theShip = new UFOEnemyShip(shipPartsFactory);
			theShip.setName("UFO Grunt Ship");
		}else if(typeOfShip == "UFO BOSS"){
			EnemyShipFactory shipPartsFactory = new UFOBossEnemyShipFactory();
			theShip = new UFOBossEnemyShip(shipPartsFactory);
			theShip.setName("UFO BOSS");

		}
		
		return theShip;
	}

}
