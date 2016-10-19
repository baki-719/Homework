package main.Pro5.zombie;

import main.Pro5.Location;

/**
 * Created by pixeleye02 on 2016-10-19.
 */
public class FlagZombie extends AbsZombie {
    public FlagZombie(Location location) {
        setAttackRage(1);
        setLocation(location);
        setAttackPoint(1);
        setLife(100);
    }
}
