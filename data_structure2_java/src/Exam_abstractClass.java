
 abstract class BankAccount {
private String accountNumber;
protected double balance;

BankAccount(String accountNumber ,double balance ){
    this.accountNumber=accountNumber;
    this.balance=balance;
}
  abstract void withdraw(double amount);

   void  deposit(double amount){
    if (amount<=0 )
        refuse("deposit must be greater than 0 ");
    else
        balance+=amount;

}
   void refuse(String why){
    System.out.println(accountNumber+ " " + "refused :"+why);
}

   void show(){
    System.out.println(accountNumber + " " + "balance: "+ balance);

}

}

class savingAccount extends BankAccount{
    savingAccount(String an, double b){
        super(an,b);
    }
    @Override
    void  withdraw(double amount){
        if (balance - amount<50)
            refuse(" you have to keep at least 50");
        else
            balance-=amount;
    }
}

  class currentaccount extends BankAccount{
    currentaccount(String an,double b){
        super(an,b);
    }
    @Override
      void withdraw(double amount){
        if(balance-amount<-200){
            refuse("overdraft limit is 200");
        }
        else
            balance-=amount;
    }
}
class StudentAccount extends BankAccount {
    StudentAccount(String n, double b) { super(n, b); }

    @Override
    void withdraw(double amount) {
        if (amount > 100) refuse("max 100 per withdrawal");
        else if (amount > balance) refuse("not enough money");
        else balance -= amount;
    }
}

 public class Exam_abstractClass {
     public static void main(String[] args) {
         // BankAccount x = new BankAccount("BAS-1", 100);


        BankAccount acc1=new savingAccount("hana" ,300);
        BankAccount acc2=new currentaccount("hana",200);
        BankAccount acc3 = new StudentAccount("hanan",200);



         acc1.deposit(50);  acc1.withdraw(300);  acc1.show();
         acc2.deposit(50);  acc2.withdraw(300);  acc2.show();
         acc3.deposit(50);  acc3.withdraw(300);  acc3.show();
 }
}
