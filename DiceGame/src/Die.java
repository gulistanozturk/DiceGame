import java.util.Random;

public class Die {
    Random rand= new Random();

    public int faceUp;

    public void roll(){
        this.faceUp=1+ rand.nextInt(6);
    }
}
