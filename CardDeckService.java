public class CardDeckService {
    
    String[] cards; // declaring a string array of cards
    /**
     * A constructor that allows for the instantiation of a CardDeckService with n amount of cards.
     * @param n amount of cards
     * @return 
     */

    public  CardDeckService(int n){
        // note that the field(cards) of the class does not match the parameter(n) of the construstor
        // for instance, String[] cards = new String[10] would create a sequence of 10 Strings in memory.
        // except that the variable n in this case isn't even known until the user inputs the value
        cards = new String[n];
        
    }
        /**
         * when user inputs name of cards, we want a way/method to set the value of particular card
         * and a way/method to print out the cards to a String
         */

         /**
          * set card number n's name to name
          *@param n
          *@param name
          */
    public void setCardName(int n, String name){
        cards[n] = name;
    }
    public String cardDeckAsString(){
        String buildString = "";
        // append every single card to the end of a string, iteratively
        for(int i = 0; i < cards.length; i++){
            if(cards[i] != null){
                buildString = buildString + cards[i]+", "; 
            }
        }
        return buildString;
        // we could use a method provided by Java in the Arrays utility class to do the same thing
        // return Arrays.toString(cards);
    }
    


}

    

