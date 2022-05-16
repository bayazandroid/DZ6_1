package com.company;

public class Main {

    public static void main(String[] args) {
        Boss baiden = new Boss(250, 20);
        baiden.weapon.setWeapon_fiery("pistol");
        baiden.weapon.setWeapon_sword("Desert Eagle");
        Skeleton skeleton = new Skeleton(300, 15, 30);
        skeleton.weapon.setWeapon_sword("meadow");
        skeleton.weapon.setWeapon_fiery("fiery meadow");
        Skeleton skeleton1 = new Skeleton(350, 10, 25);
        skeleton1.weapon.setWeapon_sword("meadow");
        skeleton1.weapon.setWeapon_fiery("ice meadow");
        System.out.println(baiden.info());
        System.out.println("-------------------------");
        System.out.println(skeleton.printInfo());
        System.out.println("-------------------------");
        System.out.println(skeleton1.printInfo());
    }
}
