public class Student {
    String name;
    int rollnumber;
    String course;
     double[] marks;
     void insert(String n,int r,String c, double[] m){
       name=n;
     rollnumber=r;
       course=c;
        marks=m;
     }
     double calculateavgmarks(){
double totalmarks=0;
for(double mark:marks){
    totalmarks += mark;
}
return totalmarks/marks.length;
     }
     void display(){
        System.out.println("name:"+name);
        System.out.println("rollnumber"+rollnumber);
        System.out.println("course:"+course);
       
        for(double mark :marks){
            System.out.println("marks: "+marks);
           
        }
        System.out.println("Average marks:"+calculateavgmarks());
     }
     public static void main(String[]args){
        Student s=new Student();
        double[] stdmarks={77.5,98.0,97.0,84.0};
        s.insert("sri",23,"BCA",stdmarks);
        s.display();
     }

}
