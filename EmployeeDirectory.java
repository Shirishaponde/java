import java.util.ArrayList;

public class EmployeeDirectory {
    String name;
    int id;
    String dept;

   
    void insert(String n, int i, String d) {
        name = n;
        id = i;
        dept = d;
    }

    
    void update(String n, int i, String d) {
        name = n;
        id = i;
        dept = d;
    }

  
    void display() {
        System.out.println("Name: " + name + ", ID: " + id + ", Department: " + dept);
    }

    public static void main(String[] args) {
       
        ArrayList<EmployeeDirectory> employees = new ArrayList<EmployeeDirectory>();

       
        EmployeeDirectory e1 = new EmployeeDirectory();
        e1.insert("Jay", 101, "HR");
        employees.add(e1);

        EmployeeDirectory e2 = new EmployeeDirectory();
        e2.insert("Ram", 102, "Engineering");
        employees.add(e2);

        EmployeeDirectory e3 = new EmployeeDirectory();
        e3.insert("Shika", 103, "Marketing");
        employees.add(e3);

       
        System.out.println("All Employees:");
        for (EmployeeDirectory employee : employees) {
            employee.display();  
        }

       
        e2.update("Bob", 102, "Product");

       
        System.out.println("\nUpdated Employees:");
        for (EmployeeDirectory employee : employees) {
            employee.display();
        }
    }
}
