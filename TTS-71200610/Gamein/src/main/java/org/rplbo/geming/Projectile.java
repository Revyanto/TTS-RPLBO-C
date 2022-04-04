package org.rplbo.geming;

public class Projectile extends Actor{
    private float speed;
    private int attackPoint;

    protected void getInfo(){

    }
    public void checkCollision(){

    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }




}
