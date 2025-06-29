package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Entity> entities = new ArrayList<Entity>();

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


    }
}