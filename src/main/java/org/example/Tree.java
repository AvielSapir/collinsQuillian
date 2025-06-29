package org.example;

public abstract class Tree extends Growing {
    Tree(String name) {
        super(name);
        addProperty("Has shell");
        addProperty("Has branches");
        addProperty("is big");

    }
}
