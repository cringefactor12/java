import java.util.Scanner;
public class Employee {
    private int id, Salary;
    private String Firstname, Lastname;
    Employee() {
        this.Firstname = "";
        this.Lastname = "";
        this.id = -1;
        this.Salary = 0;
    }

    Employee(int id, String Firstname, String Lastname, int
    Salary) {
        this.Firstname = Firstname;
        this.Lastname = Lastname;
        this.id = id;
        this.Salary = Salary;
    }
    public int getID() {
        return this.id;
    }
    public String getFirstName() {
        return this.Firstname;
    }
    public String getLastName() {
        return this.Lastname;
    }
    public String getName() {
        return this.Firstname + " " + this.Lastname;
    }
    public int getSalary() {
        return this.Salary;
    }
    public void setSalary(int Sal) {
        this.Salary = Sal;
    }
    public int getAnnualSalary() {
        return this.Salary * 12;
    }
    public int raiseSalary(int percent) {
    // increase the salary by percent and set as new
    //salary using setSalary()
        int increase = Salary * percent /100;
        int newSalary = Salary + increase;
        setSalary(newSalary);
        return newSalary;
    }
    public String toString() {
        return ("Employee[id=" + getID() + ",Name=" +
            getName() + ",Salary=" + getSalary() + "]");
    }
    public static void main(String[] args) {
        int id,Salary;
        String Firstname,Lastname;
        Scanner myObj = new Scanner(System.in);
        id = myObj.nextInt();
        Firstname=myObj.next();
        Lastname=myObj.next();
        Salary = myObj.nextInt();
        int percent = myObj.nextInt();
        Employee Emp1=new
        Employee(id,Firstname,Lastname,Salary);
        System.out.println(Emp1.getID());
        System.out.println(Emp1.getFirstName());
        System.out.println(Emp1.getLastName());
        System.out.println(Emp1.getName());
        Emp1.raiseSalary(percent);
        System.out.println(Emp1.getSalary());
        System.out.println(Emp1.toString());
    }
}
