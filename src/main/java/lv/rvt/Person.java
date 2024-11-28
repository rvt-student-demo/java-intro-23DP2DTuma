package lv.rvt;
import java.io.*;
import java.util.ArrayList;

public class Person {
    String name;
    int age;
    double weight;
    double height;

    // Constructor with 4 parameters
    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Weight: " + weight + ", Height: " + height;
    }
}