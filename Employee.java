public class Employee
{
    String name;
    int id;
    String designation;
    int salary;
    void insertrecord(String n,int i,String d,int s){
        name=n;
        id=i;
        designation=d;
        salary=s;
    }
    void display()
    {
        System.out.println(name+" "+id+" "+designation+" "+salary);
    }

    public static void main(String[]args)
    {
            Employee e1=new Employee();
            e1.insertrecord("siya",1,"hyderbad",25000);
            e1.display();
        }
    }

 