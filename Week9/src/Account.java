public class Account {
    protected double balance;
    protected String name;
    
    public Account(double balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void deposit(double a){
        if (a > 0){
            balance += a;
            System.out.println(a + " baht is deposited to " + name + ".");
        }
        else{
            System.out.println("Input number must be a positive integer.");
        }
    }
    public void withdraw(double a) throws WithdrawException {
        if (a > 0){
            balance -= a;
            System.out.println(a + " baht is withdrawn from " + name + ".");    
        }
        else if (a <= 0){
            System.out.println("Input number must be a positive integer.");        
            }
        else if ((this.getBalance() - a) < 0){
            throw new WithdrawException("Account " + name + " has not enough money");
            }
        }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void showAccount(){
        System.out.println(name + " account has " + balance + " baht.");
    }
}
