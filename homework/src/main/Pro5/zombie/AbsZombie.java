package main.Pro5.zombie;

import main.Pro5.Location;

public abstract class AbsZombie {
	private int attackPoint;
	private int life;
	private Location location;
	private int attackRage;
	public int getAttackPoint() {
		return attackPoint;
	}
	public void setAttackPoint(int attackPoint) {
		this.attackPoint = attackPoint;
	}
	public int getLife() {
		return life;
	}
	public void setLife(int life) {
		this.life = life;
	}
	public void attackMotion() {
		System.out.println("공격증");
	}
	public void deadMotion() {
		System.out.println("죽는 중");
	}
	public void walking() {
		this.location.setX(this.location.getX()-10);
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public int getAttackRage() {
		return attackRage;
	}
	public void setAttackRage(int attackRage) {
		this.attackRage = attackRage;
	}
	
	
}
