import java.util.*;

class Client {

    double accountbalance = 0.0;

    void ClientBal(double balance) {

        this.accountbalance = accountbalance+balance;
    }

    void currentBal(){
        System.out.println("Your balance is "+accountbalance);
    }
  

}

class atmMachine extends Client {

    Scanner sc = new Scanner(System.in);

    void withdrawAmount() {

        System.out.println("Enter a amount for withdraw");
        int amount = sc.nextInt();


            if(amount>accountbalance){
                System.out.println("Insufficient Balance");

            }
            else{
                accountbalance =accountbalance-amount;
                System.out.println("Withdraw Successfully....");
            }

       

    }

    void creditAmount() {

        System.out.println("Enter a amount for deposite");
        double creditAmount = sc.nextInt();

        if(creditAmount<=99){
            System.out.println("Enter upto 100 Rupees");
            creditAmount();
        }
        else{

            System.out.println("Amount Deposite Successfully....");
            ClientBal(creditAmount);    
        }

    }

    void checkBalance() {
        currentBal();
    }

}

class Atm {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        atmMachine am = new atmMachine();

        char ch;
        do{
            System.out.println("1) : Withdraw Amount\n2) : Deposite Amount\n3) : Check Balance\n");
            
            System.out.print("Enter a choice : ");

            int x = sc.nextInt();

            switch (x) {
                case 1: 
                    am.withdrawAmount();
                break;
                case 2:
                    am.creditAmount();
                
                break;
        
                case 3: 
                    System.out.println("Check Balance");
                    am.checkBalance();
                break;
                default:
                    System.out.println("Please Enter Valid Option");
                break;
             
            }
            System.out.println();
            System.out.println("Do you want to continue transaction  (y/n)");
            ch = sc.next().charAt(0);
        
        }while(ch == 'Y' || ch == 'y');
        sc.close();

    }
}