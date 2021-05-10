import java.util.ArrayList;

public class Deck {
    ArrayList<Card> deck = new ArrayList<>();

    public void createDeck() {
        for (Card.CardType crdTyp : Card.CardType.values()) {
            for (Card.CardColor crdClr : Card.CardColor.values()) {
                deck.add(new Card(crdClr, crdTyp));
            }
        }
    }

    public Deck() {

    }
}
