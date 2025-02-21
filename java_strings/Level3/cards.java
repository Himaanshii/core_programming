import java.util.*;

public class cards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length*rank.length;
        String[] deck = deck(suits, rank, numOfCards);
        String[] shuffledDeck = shuffledDeck(deck);
        System.out.println("Enter number of Players ");
        int numOfplayers = sc.nextInt();
        String[][] cardsperplayer = distribution(shuffledDeck ,numOfplayers);
        for (int i = 0; i < cardsperplayer.length; i++) {
            System.out.println("Player "+i);
            for ( int j = 0; j < deck.length/numOfplayers; j++) {
                System.out.print(cardsperplayer[i][j]+" ");
            }
            System.out.println();
            
        }        

    }

    // method to initialize deck
    public static String[] deck(String[] suits, String[] rank , int numOfCards){
        String[] deck = new String[numOfCards];
        int index = 0;
        for (int i = 0; i < rank.length; i++) {
            for(int j =0; j<suits.length; j++){
                deck[index] = rank[i]+" of "+suits[j];
                index++;
            }
            
        }
        return deck;
    }

    //method to shuffle deck
    public static String[] shuffledDeck(String[] deck){
        for (int i = 0; i < deck.length; i++) {
            int randomNumber = i+(int)(Math.random()*(deck.length-i)); // deck.length-i is used to give instruction to select number from tehse numbers 
            String temp = deck[i]; // swap
            deck[i] = deck[randomNumber];
            deck[randomNumber] = temp;
        }
        return deck;
    }

    // method to check if distribution possible 
    public static boolean ifPossible(String[] deck, int numOfplayers){
        if(deck.length % numOfplayers != 0){
            return false;
        }
        return true;
    }

    // method to distribute cards
    public static String[][] distribution(String[] deck, int numOfplayers){

        // deck.length/numOfPlayers means how many cards a player will get
        String[][] distribute = new String[numOfplayers][deck.length/numOfplayers];
        if(ifPossible(deck, numOfplayers)){
            int index = 0;
            for (int i = 0; i < numOfplayers; i++) {
                
                for (int j = 0; j < deck.length/numOfplayers; j++) {
                    distribute[i][j] = deck[index];
                    index++;
                }
            }
        }
        return distribute;
    }
}


