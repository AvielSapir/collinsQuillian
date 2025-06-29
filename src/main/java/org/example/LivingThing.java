package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class LivingThing{
    private String name;
    private List<String> properties = new ArrayList<>();
    LivingThing(String name) {
        this.name = name;
        properties.add("Can grow");
        properties.add("Is alive");
    }

    public void addProperty(String property) {
        properties.add(property);
    }

    public boolean hasProperty(String property) {
        return properties.contains(property);
    }

    @Override
    public String toString() {
        return name+": \n"+properties.toString();
    }

}
