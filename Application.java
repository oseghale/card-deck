import java.util.Scanner;

public class Application {
    /**
     * String[] args is a Java feature that we're not planning on using at the current moment -
     * if we are running a Java program from the command line, we can give it additional variables 
     * that can be accessed by the main method - these are passed in via args
     */

     /**
      * First, ask the user for the size of the deck
      * then, have the user type in a 'name' for every single card in the deck
      * finally, print out all cards of the deck 
      * @param args
      */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the deck: ");
        String deckLengthInput = sc.nextLine();
        int deckLength = Integer.parseInt(deckLengthInput);
        CardDeckService cardDeckService = new CardDeckService(deckLength);
        // we want to repeat a pattern for 'deckLength' times -
        // we want to ask the user for the name of the card,
        // and we want to set a card in the deck to that name 
        // we will start counting from 0
        for(int i = 0; i < deckLength; i++){
            String cardName = sc.nextLine();
            cardDeckService.setCardName(i, cardName);
            String currentCards = cardDeckService.cardDeckAsString();
            System.out.println(currentCards);
        }
    }

}