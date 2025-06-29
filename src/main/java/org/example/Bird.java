package org.example;

public abstract class Bird extends Animal {

    Bird(String name) {
        super(name);
        addProperty("Has feathers");
        addProperty("Has wings");
        addProperty("Can fly");
    }
}
