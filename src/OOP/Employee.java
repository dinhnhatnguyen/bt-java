package OOP;

public class Employee {
    int id;
    String firstName;
    String lastName;
    int salary;

    public Employee() {
        firstName = lastName = "";
        id = salary = 0;
    }

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getid() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getName()
    {
        return firstName+" "+lastName;
    }

    public int AnnualSalary() {
        return salary*12;
    }

    public int raiseSalary(int percent)
    {
        return salary+(percent/100)*salary;
    }

    @Override
    public String toString() {
        return String.format("Employee [id = %d , Name = %s , Salary = %d ]",id,getName(),salary);
    }
}
