public class Car {
   String make;
   String name;
   int year;
   double price;
   void insert(String m,String n,int y,double p){
    make=m;
 name=n;
  year=y;
   price=p;
   }
   void update(double newprice){

    this.price=newprice;
   }
   void display(){
    System.out.println(make+" "+name+" "+ year+" "+price);
   }
public static void main(String[]args){
    Car c=new Car();
    c.insert("vitara","breeza",2020,170000);
    c.display();
    c.update(150000);
    c.display();

}
}
