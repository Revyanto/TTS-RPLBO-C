package org.rplbo.geming;

public class Ninja extends Enemy{
    private Weapon weapon;

    public void getInfo(){
    }

    protected void attack(Avatar avatar){

    }

    protected void hitTaken(int hitTaken){

    }
    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}