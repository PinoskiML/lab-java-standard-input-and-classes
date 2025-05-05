public class Intern extends Employee{
    private final boolean Intern = true;

    public Intern(String name, String email, int age, double salary) {
        super(name, email, age, salary);
        final int interMaxSalary = 20000;
        if (salary > interMaxSalary){
            setSalary(interMaxSalary);
        }
    }

    @Override
    public double getSalary() {
             return super.getSalary();
    }
}
