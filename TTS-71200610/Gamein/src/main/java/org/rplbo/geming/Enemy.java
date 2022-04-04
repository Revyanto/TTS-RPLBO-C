package org.rplbo.geming;

public class Enemy extends Actor {
    protected int healthPoint;
    protected boolean Isboss;
    protected int moveSpeed;

    protected void attack(Avatar avatar){

    }

    protected void hitTaken(int hitTaken){

    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getSpeed() {
        return moveSpeed;
    }

    public void setSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }
}
