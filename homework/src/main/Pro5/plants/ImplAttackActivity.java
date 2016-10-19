package main.Pro5.plants;

import main.Pro5.GameObject;
import main.Pro5.Location;

public class ImplAttackActivity implements IPlantActivity {

	@Override
	public GameObject activity(Location location) {
		// TODO Auto-generated method stub
		return new Shot();
	}

}
