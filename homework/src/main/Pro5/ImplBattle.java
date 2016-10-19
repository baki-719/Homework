package main.Pro5;

import main.Pro5.plants.AbsPlant;
import main.Pro5.plants.Shot;
import main.Pro5.zombie.AbsZombie;

import java.util.ArrayList;
import java.util.List;

public class ImplBattle implements IBattle {
	private List<AbsZombie> zombies;
	private List<AbsPlant> plants;
	
	public ImplBattle() {
		this.zombies = new ArrayList<>();
		this.plants = new ArrayList<>();
	}
	
	public void doBattle() {
		for(AbsZombie zombie : this.zombies) {
			for(AbsPlant plant : this.plants) {
				if(zombie.getLocation().getX()+zombie.getAttackRage() 
				> plant.getLocation().getX()) {
					zombie.walking();
					this.attackPlant(zombie, plant);
				}
				if(plant.getAttackRange() <= zombie.getLocation().getX()) {
					plant.attackMotion();
					switch(plant.getType()) {
					case ATTACKER:
						this.attackZombie(plant, zombie);
						break;
					default:
						break;
					}
				}
			}
		}
	}
	@Override
	public void attackPlant(AbsZombie zombie, AbsPlant plant) {
		zombie.attackMotion();
		plant.setLife(plant.getLife()-zombie.getAttackPoint());
		if(plant.getLife() <= 0) {
			plant.deadMotion();
			this.plants.remove(plant);
		}
	}

	@Override
	public void attackZombie(AbsPlant plant, AbsZombie zombie) {
		Shot shot = (Shot) plant.plantsActivity();
		if(shot.getLocation().getX() == zombie.getLocation().getX()) {
			zombie.setLife(zombie.getLife()-shot.getAttackPoint());
			if(zombie.getLife() <= 0) {
				zombie.deadMotion();
				this.zombies.remove(zombie);
			}
		}
	}

}
