import java.util.ArrayList;

public class Deck
{
    private final ArrayList<String> CardDeck = new ArrayList<>();

    public void SetPack()
    {
        CardDeck.clear();
        for(int i = 0;i<4;i++)
        {
            for(int j = 0;j<13;j++)
            {
                String Card = switch (i)
                {
                    case 0 -> "S";
                    case 1 -> "C";
                    case 2 -> "H";
                    case 3 -> "D";
                    default -> "";
                };
                switch(j)
                {
                    case 0 -> Card += "A";
                    case 10 -> Card += "J";
                    case 11 -> Card += "Q";
                    case 12 -> Card += "K";
                    default -> Card += j+1;
                }
                CardDeck.add(Card);
            }
        }
    }

    public ArrayList<String> GetDeck()
    {
        return CardDeck;
    }
}