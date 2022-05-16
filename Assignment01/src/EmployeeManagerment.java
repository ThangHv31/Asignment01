import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeManagerment {

    static Scanner sc = new Scanner(System.in);
    static String EMAIL_PATTERN =
            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,})$";
    public static ArrayList<Employee> list = new  ArrayList<Employee>();

    public static void nhap(){
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        for(int i = 0; i<n ; i++){
            System.out.println("Enter employee["+ (i+1)+ "]");
            System.out.println("Enter code( number): ");
            int emCode = sc.nextInt();
            if(emCode < 0) {
                System.out.println("Ma nhan vien khong hop le !");
                return;
            }
            sc.nextLine();
            System.out.println("Enter name: ");
            String emName = sc.nextLine();
            if(emName.length() <= 0) {
                System.out.println("Ten nhan vien khong hop le !");
                return;
            }
            System.out.println("Enter gender (1: male, 0: female): ");
            byte emGender = sc.nextByte();
            sc.nextLine();
            System.out.println("Enter email: ");
            String emMail = sc.nextLine();
            if(Pattern.matches(EMAIL_PATTERN, emMail) == false) {
                System.out.println("Email khong hop le !");
                return;
            }
            System.out.println("Enter address: ");
            String emAddress = sc.nextLine();
            if(emAddress.length() <= 0) {
                System.out.println("Dia chi khong hop le !");
                return;
            }
            System.out.println("Enter salary: ");
            double emSalary = sc.nextDouble();
            if(emSalary < 0) {
                System.out.println("So luong hop le !");
                return;
            }
            System.out.println("--------------------------------");
            list.add(new Employee(emCode,emName,emGender,emMail,emAddress,emSalary));
        }
    }
    public static void hienThi(){
        System.out.println("\nDanh sach nhan vien: ");
        for(Employee em : list){
            System.out.println(em.toString());
        }
    }
    public static void displaySlary(){
        System.out.println("\nDanh sach nhan vien co luong >= $1000: ");
        for(Employee em : list){
            if (em.getSalary() >= 1000) {
                System.out.println(em.toString());
            }
        }
    }

    public static void main(String[] args) {
    nhap();
    hienThi();
    displaySlary();
    }
}
