package lv.rvt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PersonManager {
     public static void main(String[] args) {
        ArrayList<Person> personas = new ArrayList<>();

        // Read the CSV file
        try (BufferedReader reader = new BufferedReader(new FileReader("personas.csv"))) {
            String line;
            reader.readLine(); // Skip the header line
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1].trim());
                double weight = Double.parseDouble(parts[2].trim());
                double height = Double.parseDouble(parts[3].trim());
                personas.add(new Person(name, age, weight, height));
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        // Print all persons
        for (Person person : personas) {
            System.out.println(person);
        }

        // Calculate and print the average age
        if (!personas.isEmpty()) {
            double totalAge = 0;
            for (Person person : personas) {
                totalAge += person.age;
            }
            double averageAge = totalAge / personas.size();
            System.out.println("Average Age: " + averageAge);
            
        }
    }
}

