package com.jxufe.demo;

import java.io.Serializable;

/**
 * Hello world!
 */
public class Apple implements Serializable{
    private int id;
    private String name;

    public Apple() {
    }

    public Apple(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
