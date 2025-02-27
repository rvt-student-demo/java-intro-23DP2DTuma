package lv.rvt;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class PersonManager {
    private ArrayList<Person> personList;
    private static final String FILE_NAME = "personas.csv";

    public PersonManager() throws Exception {
        this.personList = loadPersonList();
    }

    public void run() throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(ConsoleColors.CYAN_BOLD + "Choose command: add, list, sort, exit" + ConsoleColors.RESET);
            String command = scanner.nextLine();
            if (command.equals("exit")) break;
            
            switch (command) {
                case "add":
                    System.out.print("Enter name, age, weight, height, address: ");
                    String[] data = scanner.nextLine().split(", ");
                    if (data.length == 5) {
                        try {
                            Person person = new Person(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), data[4]);
                            addPerson(person);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid input format. Please enter correct values.");
                        }
                    } else {
                        System.out.println("Incorrect number of fields. Expected format: name, age, weight, height, address");
                    }
                    break;
                case "list":
                    showPersonList();
                    break;
                case "sort":
                    System.out.println("Sort by: name, age, address");
                    String criteria = scanner.nextLine();
                    sortAndShow(criteria);
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        scanner.close();
    }

    public void showPersonList() {
        System.out.println(ConsoleColors.GREEN_BOLD + "Name, Age, Weight, Height, Address" + ConsoleColors.RESET);
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public void sortAndShow(String criteria) {
        switch (criteria) {
            case "name":
                personList.sort(Comparator.comparing(Person::getName));
                break;
            case "age":
                personList.sort(Comparator.comparingInt(Person::getAge));
                break;
            case "address":
                personList.sort(Comparator.comparing(Person::getAddress));
                break;
            default:
                System.out.println("Invalid sort criteria");
                return;
        }
        showPersonList();
    }

    public void addPerson(Person person) throws Exception {
        BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        writer.write(person.toCsvRow());
        writer.newLine();
        writer.close();
        personList.add(person);
        System.out.println("Person added successfully.");
    }

    private ArrayList<Person> loadPersonList() throws Exception {
        ArrayList<Person> list = new ArrayList<>();
        Path path = Paths.get(FILE_NAME);
        if (!Files.exists(path)) {
            Files.write(path, "name,age,weight,height,address\n".getBytes(), StandardOpenOption.CREATE);
        }
        BufferedReader reader = Files.newBufferedReader(path);
        reader.readLine(); 
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(", ");
            if (parts.length == 5) {
                list.add(new Person(parts[0], Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]), parts[4]));
            }
        }
        return list;
    }
}


