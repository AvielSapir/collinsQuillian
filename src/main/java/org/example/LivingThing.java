package org.example;

public abstract class LivingThing extends Entity {

    LivingThing(String name) {
        super(name);
        this.addProperty("Can grow");
        this.addProperty("Is alive");
    }

}
