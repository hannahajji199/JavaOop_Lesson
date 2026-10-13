 class Account {

    String Accountholder;
    double Balance;
    Account(String Acc_holder ,double balance){
        this.Accountholder=Acc_holder;
        this.Balance=balance;


        }
        void printinfo(){
            System.out.println("the Account_holder's name is : "+ Accountholder);
            System.out.println("the balance's name is : "+Balance);
    }
    public static void main() {
        Account Acc1=new Account("Hanan",300);
        Acc1.printinfo();
    }


}
