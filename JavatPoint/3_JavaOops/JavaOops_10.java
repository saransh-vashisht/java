/**
 *  object and Class Example -->10
 * 
 * Real World Example:Account
 * 
 * JavaOops_10
 * 
 * Java Program to demonstrate the working of 
 * the banking system where we deposit and withdraw amount from our account .
 * Creating an Account class which has deposit() and withdraw() methods
 * 
 */
class Account{
    int acc_no;
    String name;
    float amount;
    // Method to initialize object 
    void insert(int a,String n,float amt){
        acc_no=a;
        name=n;
        amount=amt;

    }

    // deposit method 
    void deposit(float amt){
        amount=amount+amt;
    }

    // withdraw method 
    void withdraw(float amt){
        if (amount<amt) {
            System.out.println("Insufficient Balance");

        } else {
            amount= amount-amt;
            System.out.println(amt+" withdrawn");

        }
    }


    // Method to check the balance of the account 
    void checkBalance(){
        System.out.println("Balance is: "+ amount);

    }

    // method to display the values of an object
    void display(){
        System.out.println(acc_no+" "+name+" "+amount);
    }
}

// Creating a test account to deposit and withdraw amount 

public class JavaOops_10 {

    public static void main(String[] args) {
        Account a1= new Account();
        a1.insert(989105, "Saransh", 1000);
        a1.display();
        a1.checkBalance();
        a1.deposit(40000);
        a1.checkBalance();
        a1.withdraw(15000);
        a1.checkBalance();

    }
}