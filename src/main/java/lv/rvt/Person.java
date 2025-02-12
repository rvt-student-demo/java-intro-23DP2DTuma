package lv.rvt;

abstract class Person {
    // Abstract method to calculate salary
    public abstract double calculateSalary();
}

// Student class extending Person
class Student extends Person {
    @Override
    public double calculateSalary() {
        // Assuming students earn a stipend
        return 1000.0; // Example stipend amount
    }
}

// Teacher class extending Person
class Teacher extends Person {
    private double baseSalary;
    private double bonus;

    // Constructor
    public Teacher(double baseSalary, double bonus) {
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

