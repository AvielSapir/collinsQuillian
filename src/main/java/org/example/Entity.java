package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Entity {
    private String name;
    private List<String> properties = new ArrayList<>();

    Entity(String name) {
        this.name = name;
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
