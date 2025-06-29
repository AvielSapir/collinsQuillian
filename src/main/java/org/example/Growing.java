package org.example;

public abstract class Growing extends LivingThing{
    Growing(String name) {
        super(name);
        addProperty("Has Roots");
    }
}
