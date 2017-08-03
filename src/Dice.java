import java.util.Random;

public class Dice {
    private int value;
    private Random rand;
    public Dice() {
        rand = new Random();
        value = 1;
    }
    public void roll (){
        value = rand.nextInt(6)+1;
    }
    public int getValue(){
        return value;
    }
}
