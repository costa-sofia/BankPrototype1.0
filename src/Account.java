public class Account
{
    int accountNumber;
    String accountHolder;
    double accountBalance = 0;

    /*Constructors*/
    public Account(){}

    public Account (int accountNumber, String accountHolder, double accountBalance)
    {
        this.accountNumber= accountNumber;
        this.accountHolder= accountHolder;
        this.accountBalance=accountBalance;

    }

    //deposit method
    void deposit(double amt)
    {
        this.accountBalance = this.accountBalance + amt;
        System.out.println("$" + amt + " Credited | Balance: $" + this.accountBalance);
        System.out.println("|-------------------------------------|");
    }

    //withdraw method
    void withdraw(double amt)
    {
        if(this.accountBalance >= amt)
        {
            this.accountBalance = this.accountBalance - amt;
            System.out.println("$" + amt + " Debited | Balance: $" + this.accountBalance);
        }
        else
        {

            System.out.println("ERROR: Insufficient Balance");
        }
    }

    //getting account details method
    void getDetails()
    {
        System.out.println("Account Number: " + this.accountNumber + " | Account Holder: "+ this.accountHolder + " | Balance: $" + this.accountBalance);
    }



}
