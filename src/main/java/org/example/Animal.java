package org.example;

public abstract class Animal extends LivingThing{
    Animal(String name) {
        super(name);
        addProperty("Can move");
        addProperty("Has skin");
        addTag("Animal");
    }
}
