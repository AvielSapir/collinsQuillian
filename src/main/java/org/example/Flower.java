package org.example;

public abstract class Flower extends Growing {
    Flower(String name) {
        super(name);
        addProperty("Has petals");
        addProperty("Has leaves");
        addProperty("is beautiful");

    }
}
