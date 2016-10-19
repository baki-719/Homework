package main.Pro5;

import main.Pro5.plants.AbsPlant;
import main.Pro5.zombie.AbsZombie;

public interface IBattle {
	public void doBattle();
	public abstract void attackZombie(AbsPlant plant, AbsZombie zombie);
	public abstract void attackPlant(AbsZombie zombie, AbsPlant plant);
}
