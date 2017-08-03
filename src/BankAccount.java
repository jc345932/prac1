public class BankAccount {
    private String id;
    private  double balance;
    public BankAccount(){
        this("tempID", 0.0);
    }
    public BankAccount(String id, double amt){
        this.id = id;
        balance = amt;
    }
    public double getBalance() {return balance;}
    public String getid(){return id;}
    public void setid(String newid){id = newid;}
    public void deposit (double amt){balance= balance+amt;}
    public boolean withdraw(double amt){
        if (amt<=balance){
            balance = balance-amt;
        return true;
        }else {
            return false;
        }

    }
}
