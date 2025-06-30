package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LivingThing> entities = new ArrayList<LivingThing>();

        // fish
        Salmon salmon = new Salmon();
        entities.add(salmon);
        Sunfish sunfish = new Sunfish();
        entities.add(sunfish);

        // bird
        Canary canary = new Canary();
        entities.add(canary);
        Robin robin = new Robin();
        entities.add(robin);

        // flower
        Daisy daisy = new Daisy();
        entities.add(daisy);
        Rose rose = new Rose();
        entities.add(rose);

        // tree
        Oak oak = new Oak();
        entities.add(canary);
        Pine pine = new Pine();
        entities.add(pine);


        for (LivingThing entity : entities) {
            System.out.println(entity);
        }




    }
}