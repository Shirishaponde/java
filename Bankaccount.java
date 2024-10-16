public class Bankaccount {
    String acountholdername;
    int accountnumber;
    float balance;
    void insert(String accname,int accnum,float b){
      acountholdername=accname;
accountnumber=accnum;
    balance=b;
    }
    void deposit(float amount){
        
    this.amount=balance;

    }
    void display(){
        System.out.println(acountholdername+" "+accountnumber+" "+balance);
    }
   
}
