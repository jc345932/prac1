public class CashCard {
    private String id;
    private double value;
    public CashCard(String id, double amt){
        this.id=id; //this is to resolve ambiguity
        value = amt;
    }
    public CashCard(){//defult construtor
        //id = "NA";
        //value = 0;
        this("NA",0);
        }
    public String getld() {return id;}
    public void setld(String newid){id = newid;}
    public double getValue() {return value;}
    public void topup(double amt) {value = value +amt;}
    public boolean deduct (double amt)
    {
        if (amt <= value) {
            value = value - amt;
            return true;
        } else {
            return false;
        }
    }
}