
import java.util.*;
public class  BankAccount
{
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    // Constructor with no arguments
    public BankAccount() {
        this("", 0, "Savings", 0.0);
    }

    // Constructor with name and account number arguments
    public BankAccount(String name, int accountNumber) {
        this(name, accountNumber, "Savings", 0.0);
    }

    // Constructor with all arguments
    public BankAccount(String name, int accountNumber, String accountType, double balance) {
        this.depositorName = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to assign initial values
    public void setInitialValues(String name, int accountNumber, String accountType, double balance) {
        this.depositorName = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance is " + balance);
        } else {
            System.out.println("Invalid amount. Please enter a positive amount to deposit.");
        }
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) {
        if(amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive amount to withdraw.");
        } else if(amount > balance) {
            System.out.println("Insufficient balance. You can withdraw up to " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance is " + balance);
        }
    }

    // Method to display name and balance
    public void display() {
        System.out.println("Depositor name: \n" + depositorName);
        System.out.println("Account number: \n" + accountNumber);
        System.out.println("Account type: \n" + accountType);
        System.out.println("Current balance: \n" + balance);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
     // Create an instance of BankAccount with no arguments
BankAccount account1 = new BankAccount();
// Set initial values using setInitialValues method
account1.setInitialValues("John Smith", 12345, "Savings",0.0);
// Deposit 500
System.out.println("Enter the amount That You want to Deposit:");
double depositAmount=s.nextDouble();
account1.deposit(depositAmount);
// Withdraw 200
System.out.println("Enter the amount That You want to Withdrawr:");
double withdrawAmount=s.nextDouble();
account1.withdraw(withdrawAmount);
// Display account information
    }
}

0 comments on commit 22a9864
@21bca50
 
Add heading textAdd bold text, <Ctrl+b>Add italic text, <Ctrl+i>
Add a quote, <Ctrl+Shift+.>Add code, <Ctrl+e>Add a link, <Ctrl+k>
Add a bulleted list, <Ctrl+Shift+8>Add a numbered list, <Ctrl+Shift+7>Add a task list, <Ctrl+Shift+l>
Directly mention a user or team
Reference an issue, pull request, or discussion
Add saved reply
Leave a comment
No file chosen
Attach files by dragging & dropping, selecting or pasting them.
Styling with Markdown is supported
Footer
© 2023 GitHub, Inc.
Footer navigation
Terms
Privacy
Security
Status
Docs
Contact GitHub
Pricing
API
Training
Blog
About
Create sol.1 · vtcbca/406-java-journal-21bca50@22a9864 