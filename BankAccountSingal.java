package _concept.IQ;
class Bank_account{
    private String accountNumber;
    private double balance;
    //constructor
    Bank_account(String accountNumber,double balance)
    {
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(double amount)
    {
        balance=balance+=amount;
        System.out.println("Deposited"+amount +"New balance"+this.balance);
    }
    public double getter(){
        return balance;
    }
    public void displaybal()
    {
        System.out.println("Account Number:"+this.accountNumber);
        System.out.println("Balance:"+this.balance);
    }
}
class SavingAccount extends Bank_account{
    private double interetRate;
    SavingAccount(String accountNumber,double balance,double interetRate)
    {
        super(accountNumber, balance);
        this.interetRate=interetRate;
    }
    public void calculateInterest(){
        double interest=getter();//this.interetRate;
        super.deposit(interest);
        System.out.println("Interest adding"+interest);
    }
}
class Main1
{
   public static void main(String[] args) {
    SavingAccount sa=new SavingAccount("S1001", 1000, 0.05);
    //SavingAccount.deposit(400.0);
    //SavingAccount.dp();
    //Calculating and adding interest>>
    sa.calculateInterest();
    sa.displaybal();
   } 
}