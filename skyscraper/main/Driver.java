package skyscraper.main;

import skyscraper.service.ChiefArchitect;

public class Driver {
	public static void main(String[] args) {
		ChiefArchitect objDriver = new ChiefArchitect();
		objDriver.userInputs();
		objDriver.orderOfConstruction(objDriver.totalFloorSize);
	}
}
