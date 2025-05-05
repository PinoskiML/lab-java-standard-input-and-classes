import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        System.err.println("Lab 106");

        //FILE HANDLING
        String direccionFichero = "out/production/lab-java-standard-input-and-classes/.idea/employees.txt";
        System.out.println(direccionFichero);

        File employees = new File(direccionFichero);
          //makes file


        FileWriter fileWriter = new FileWriter(direccionFichero, false);


        //create employees
        Employee employee = new Employee("Karl", "Karl@HQ.com", 22,124430);
        Employee employee1 = new Employee("Jimmy", "Jimmy@HQ.com", 24,22000);
        Employee employee2 = new Employee("Jay", "jay@HQ.com", 25,20400);
        Employee employee3 = new Employee("Jackson", "Jackson@HQ.com", 32,22000);
        Employee employee4 = new Employee("Junior", "Junior@HQ.com", 42,23300);
        Employee employee5 = new Employee("Sam", "Sam5@HQ.com", 22,20323.45);
        Employee employee6 = new Employee("Karlton", "Karlton@HQ.com", 52,33000);
        Employee employee7 = new Employee("Kimmy", "Kimmy@HQ.com", 42,23003.12);
        Intern intern0 = new Intern("Kroll", "Kroll@HQ.com", 23,19540.43);
        Intern intern1 = new Intern("Dean", "Dean@HQ.com", 22,20640.69);

        // System.out.println(employee1);  //  checks Objects created correctly

        ArrayList<Employee> employeeArrayList =  new ArrayList<>();
        employeeArrayList.add(employee);
        employeeArrayList.add(employee1);
        employeeArrayList.add(employee2);
        employeeArrayList.add(employee3);
        employeeArrayList.add(employee4);
        employeeArrayList.add(employee5);
        employeeArrayList.add(employee6);
        employeeArrayList.add(employee7);
        employeeArrayList.add(intern0);
        employeeArrayList.add(intern1);


        fileWriter.write(employeeArrayList.toString());
        fileWriter.close();
    }
}
