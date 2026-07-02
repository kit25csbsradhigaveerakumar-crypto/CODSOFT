import java.util.Scanner;

class BankAccount{
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public boolean withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            return true;
        }
        return false;
    }
}

class ATM{

    private BankAccount account;

    public ATM(BankAccount account){
        this.account = account;
    }

    public void checkBalance() {
        System.out.println("Current Balance: Rs. " + account.getBalance());
    }

public void deposit(double amount){
    if(amount > 0){
        account.deposit(amount);
        System.out.println("Amount Deposited Successfully!");
        checkBalance();
    }else{
        System.out.println("Invalid Amount!");
    }
}
public void withdraw(double amount){
    if(amount <= 0){
        System.out.println("Invalid Amount!");
    }else if(account.withdraw(amount)){
        System.out.println("Amount Withdrawn Successfully!");
        checkBalance();
    }else{
        System.out.println("Insufficient Balance!");
    }
}
}

public class ATMInterface{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int pin = 1234;

        System.out.print("ENTER ATM PIN: ");
        int enterpin = sc.nextInt();

        if(enterpin != pin){
            System.out.println("Incorrect PIN! Access Denied.");
            sc.close();
            return;
        }

        BankAccount account = new BankAccount(10000);
        ATM atm = new ATM(account);

        int choice;

        do{
            System.out.println("\n==================================");
            System.out.println("              ATM MENU");
            System.out.println("==================================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch(choice){
                case 1:
                    atm.checkBalance();
                    break;
                
                case 2:
                    System.out.print("Enter amount to deposit: Rs. ");
                    double depositAmount = sc.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                
                case 3:
                    System.out.print("Enter amount to withdraw: Rs. ");
                    double withdrawAmount = sc.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Thank You for Using the ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        }while (choice != 4);

        sc.close();
    }
}