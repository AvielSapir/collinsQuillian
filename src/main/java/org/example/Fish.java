package org.example;

public abstract class Fish extends Animal {
    Fish(String name) {
        super(name);
        addProperty("Has dandruff");
        addProperty("Can swim");
        addProperty("Has gills");

    }
}
