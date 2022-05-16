package com.company;

public class Skeleton extends Boss{
    private int arrows;

    public Skeleton(int health, int damage, int arrows) {
        super(health, damage);
        this.arrows = arrows;
    }

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printInfo(){
        return super.info() + "\nArrows: " + getArrows();
    }
}
