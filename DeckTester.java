public class DeckTester
{
    public static void main(String[] r, String[] s, int[] v)
    {
        Deck deck1 = new Deck(r, s, v);
        deck1.isEmpty();
        deck1.size();
        deck1.deal();
    }
}