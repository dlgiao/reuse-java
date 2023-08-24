package com.kmmania;

public class Main {
    public static void main(String[] args) {
        Sprinter sprinter = new Sprinter("Usain", "Bolt", "sprinting");
        sprinter.display();

        Thrower thrower = new Thrower("Ryan", "Crouser", "shot put");
        thrower.display();

        DistanceRunner distanceRunner = new DistanceRunner("Eliud", "Kipchoge", "the marathon");
        distanceRunner.display();

        Jumper jumper = new Jumper("Marco", "Tamberi", "high jump");
        jumper.display();
    }
}