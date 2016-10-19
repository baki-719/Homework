package main.Pro5.plants;

import main.Pro5.GameObject;
import main.Pro5.Light;
import main.Pro5.Location;
import main.Pro5.plants.IPlantActivity;

public class ImplProductLight implements IPlantActivity {

	@Override
	public GameObject activity(Location location) {
		// TODO Auto-generated method stub
		Light light = new Light();
		Location lightLocation = new Location();
		lightLocation.setX(location.getX()-10);
		lightLocation.setY(location.getY());
		light.setLocation(lightLocation);
		return light;
	}
	
}
