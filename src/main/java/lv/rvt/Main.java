package lv.rvt;


public class Main {
  public static void main(String[] args) {
      Person student = new Student();
      Person teacher = new Teacher(5000.0, 1000.0);

      System.out.println("Student Salary: $" + student.calculateSalary());
      System.out.println("Teacher Salary: $" + teacher.calculateSalary());
  }
}



    



