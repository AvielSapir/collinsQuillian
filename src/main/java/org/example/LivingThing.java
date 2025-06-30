package org.example;

import java.util.ArrayList;
import java.util.List;

public abstract class LivingThing{
    private String name;
    private List<String> properties = new ArrayList<>();
    private List<String> tags = new ArrayList<>();


    LivingThing(String name) {
        this.name = name;
        properties.add("Can grow");
        properties.add("Is alive");
        tags.add("LivingThing");
    }

    public void addProperty(String property) {
        properties.add(property);
    }
    public void addTag(String tag) {
        tags.add(tag);
    }

    public boolean hasProperty(String property) {
        return properties.contains(property);
    }

    public boolean hasTag(String tag) {
        return tags.contains(tag);
    }

    @Override
    public String toString() {
        String text ="";
        text += "| Name:       " + name + "\n";
        text += "| Tags:       " + tags + "\n";
        text += "| Properties: " + properties + "\n";

        return text;
    }

}
