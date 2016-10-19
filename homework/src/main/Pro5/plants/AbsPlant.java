package main.Pro5.plants;

import main.Pro5.GameObject;
import main.Pro5.Location;

public abstract class AbsPlant {
    private Location location;
    private int life;
    private int attackRange;
    private PlantType type;
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    private IPlantActivity activity;

    public AbsPlant(){}

    public AbsPlant(IPlantActivity activity) {
        this.activity = activity;
    }

    public GameObject plantsActivity() {
        // TODO Auto-generated method stub
        return this.activity.activity(this.location);
    }

    public Location getLocation() {
        // TODO Auto-generated method stub
        return this.location;
    }

    public void setLocation(Location location) {
        // TODO Auto-generated method stub
        this.location = location;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public void deadMotion() {
        System.out.println("죽는 중");
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }

    public void attackMotion() {
        System.out.println("공격중");
    }

    public PlantType getType() {
        return type;
    }

    public void setType(PlantType type) {
        this.type = type;
    }


}
