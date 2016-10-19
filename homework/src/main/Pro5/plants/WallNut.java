package main.Pro5.plants;

import main.Pro5.Location;

/**
 * Created by pixeleye02 on 2016-10-19.
 */
public class WallNut extends AbsPlant {
    public WallNut(Location location) {
        setLife(200);
        setAttackRange(0);
        setType(PlantType.DEFENDER);
        setLocation(location);
        setCost(50);
    }

    public WallNut(IPlantActivity activity) {
        super(activity);
    }
}
