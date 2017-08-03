

public class Q3 {
    public static void main (String[] args){
        BankAccount ac = new BankAccount();
        BankAccount ac2 = new BankAccount("s2", 200);
        System.out.println("id:"+ac.getid());//print tempID
        System.out.println("Balance:"+ac.getBalance());//print 0.0
        System.out.println("id:"+ac2.getid());//print s2
        System.out.println("Balance:"+ac2.getBalance());//print 200
    }
}
