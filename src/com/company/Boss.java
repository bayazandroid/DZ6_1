package com.company;

public class Boss extends GameEntity {
    Weapon weapon = new Weapon();

    public Weapon getWeapon () {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
    this. weapon = weapon;
    }
    public Boss printInfo (int heignt, int damage) {
        super(heignt, damage);
    }
    public String info(){
        return "HP:"
+setHeight() +getDamage() +getSword() + "" +getFiery();
    }
}
