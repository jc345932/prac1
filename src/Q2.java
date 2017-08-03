import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class Q2 {
    public static void main(String[] args)
    {
        CashCard cc = new CashCard("s001",20.0);
        System.out.println(cc.getValue());//print 20
        cc.topup(10);
        System.out.println(cc.getValue());//print 30
        if (cc.deduct(100)) {
            System.out.println("successful deduction");
        }else{
            System.out.println("money no enough, lah");
        }
        CashCard c2 = new CashCard();
        System.out.println(c2.getValue());//print 0
        System.out.println(cc.getValue());//print 30
        Dice d = new Dice();
        d.roll();
        if (d.getValue()>=4);{
            cc.topup(d.getValue()* 10);
        }
    }
}

