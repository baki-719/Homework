package main.Pro5.plants;

import main.Pro5.Location;

/**
 * Created by pixeleye02 on 2016-10-19.
 */
public class Sunflower extends AbsPlant {
    public Sunflower(Location location) {
        setCost(50);
        setLocation(location);
        setType(PlantType.PRODUCTOR);
        setAttackRange(0);
        setLife(100);
    }

    public Sunflower(IPlantActivity activity) {
        super(activity);
    }
}
