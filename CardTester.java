public class CardTester
{
    public static void main(String[] args)
    {
        Card tenHearts = new Card("ten", "hearts", 10);
        Card threeSpades = new Card("three", "spades", 3);
        Card kingClubs = new Card("king", "clubs", 13);
        System.out.println(tenHearts.toString());
        System.out.println(threeSpades.toString());
        System.out.println(kingClubs.toString());
    }
}