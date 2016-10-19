package main.Pro5.zombie;

import main.Pro5.Location;

/**
 * Created by pixeleye02 on 2016-10-19.
 */
public class BuckethaddZombie extends AbsZombie {
    public BuckethaddZombie(Location location) {
        setLife(150);
        setAttackPoint(1);
        setLocation(location);
        setAttackRage(1);

    }
}
