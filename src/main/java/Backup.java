import java.io.Serializable;
/**
 * Created by user on 2017-06-19.
 */
public class Backup implements Serializable{
    int storedMoney;
    BlackjackHand storedDealerHand;
    BlackjackHand storedUserHand;
    Deck storedDeck;
}
