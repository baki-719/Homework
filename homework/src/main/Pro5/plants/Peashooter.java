package main.Pro5.plants;

import main.Pro5.Location;

/**
 * Created by ge62 on 2016-10-19.
 */
public class Peashooter extends AbsPlant {

    public Peashooter(Location location) {
        setLife(100);
        setAttackRange(5);
        setType(PlantType.ATTACKER);
        setLocation(location);
        setCost(100);
    }

    public Peashooter(IPlantActivity activity) {
        super(activity);
    }


}
