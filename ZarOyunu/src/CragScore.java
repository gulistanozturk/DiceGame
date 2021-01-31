public class CragScore{
    public static void main(String[] args) {
        int score;

        Die die1 = new Die();
        Die die2 = new Die();
        Die die3 = new Die();

        die1.roll();
        die2.roll();
        die3.roll();

        System.out.println("Die 1 shows " + die1.faceUp);
        System.out.println("Die 2 shows " + die2.faceUp);
        System.out.println("Die 3 shows " + die3.faceUp);

        if (die1.faceUp + die2.faceUp + die3.faceUp == 13) // zarların toplamı 13 ise
            if (die1.faceUp == die2.faceUp || die1.faceUp == die3.faceUp || die2.faceUp == die3.faceUp)  // ve eğer 2 zar birbirine eşit ise
                score = 50;
            else  // toplam 13 ama eğer herhangi bir zar birbirine eşit değilse
                score = 26;
        else if (die1.faceUp == die2.faceUp && die2.faceUp == die3.faceUp) // eğer 3 zar eşitse
            score = 25;
        else  // bu durumlardan hiçbiri olmazsa
            score = 0;
        System.out.println("Score is :  " + score);
    }
}
