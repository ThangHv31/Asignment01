import java.util.ArrayList;
import java.util.Scanner;

public class Employee {
    private int id;
    private String employee_name;
    private byte gender;
    private String email;
    private String address;
    private double salary;


    //method
    public Employee() {
    }

    public Employee(int id, String employee_name, byte gender, String email, String address, double salary) {
        this.id = id;
        this.employee_name = employee_name;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "id=" + id +
                ", employee_name= " + employee_name +
                ", gender= " + gender +
                ", email= " + email +
                ", address= " + address +
                ", salary= $" + salary +
                ']'+"\n";
    }

    // getter setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public byte getGender() {
        return gender;
    }

    public void setGender(byte gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
