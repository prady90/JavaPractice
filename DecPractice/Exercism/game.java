package Exercism;

public class game {

    public static int parseCard(String card) {
       // throw new UnsupportedOperationException("Please implement the Blackjack.parseCard method");
        int parsedCardValue=0;
        switch(card){
            case "ace": parsedCardValue = 11; break;
            case "jack" : case "queen" : case "king" : case "ten" :{
               parsedCardValue = 10;
                break;
            } 
                case "nine": parsedCardValue = 9;  break;
                case "eight": parsedCardValue = 8;  break;
                case "seven": parsedCardValue = 7;  break;
                case "six": parsedCardValue = 6;  break;
            case "five" : parsedCardValue = 5;  break;
                case "four": parsedCardValue = 4;  break;
                case "three": parsedCardValue = 3;  break;
                case "two": parsedCardValue = 2;  break;
            default: parsedCardValue = 0;  break;
        }
        return parsedCardValue;
    }

    public static boolean isBlackjack(String card1, String card2) {
       // throw new UnsupportedOperationException("Please implement the Blackjack.isBlackjack method");
     /*   boolean isBlackJackResult = false;
        int cardvalue1 = parseCard(card1);
        int cardvalue2 = parseCard(card2);
        int sum = cardvalue1+cardvalue2;
        */
       //if(sum==21){isBlackJackResult= true;}
     return    (parseCard(card1) + parseCard(card2)==21)? true:false;
         //  return isBlackJackResult;
       }
    

    public static String largeHand(boolean isBlackjack, int dealerScore) {
       // throw new UnsupportedOperationException("Please implement the Blackjack.largeHand method");
        String largeHandStringValue=null;
        if(isBlackjack){
            if(dealerScore < 10 ) {
                largeHandStringValue= "W";
                    }else{ 
                largeHandStringValue= "S";
                }
            }else{
            largeHandStringValue= "P";
        }
        return largeHandStringValue;
    }

    public static String smallHand(int handScore, int dealerScore){
        
    
        //throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
        String smallHandStringValue =null;
        if(handScore>=17){
            smallHandStringValue="S";
        }else if(handScore <=11){
            smallHandStringValue ="H";
        }else{
                if(handScore>=12 && handScore<=16 && dealerScore<=7){
                    smallHandStringValue = "S";
                }else{
                    smallHandStringValue = "H";
                }
            
        }
        return smallHandStringValue;
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }


     public static void main(String args[]){
         firstTurn("two","ten","seven");
    
}
}
