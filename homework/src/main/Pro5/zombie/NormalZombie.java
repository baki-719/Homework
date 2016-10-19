package main.Pro5.zombie;

import main.Pro5.Location;

/**
 * Created by pixeleye02 on 2016-10-19.
 */
public class NormalZombie extends AbsZombie {
    public NormalZombie(Location location) {
        setLife(50);
        setAttackPoint(1);
        setLocation(location);
        setAttackRage(1);
    }
}
