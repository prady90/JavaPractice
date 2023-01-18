package Exercism;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Scrabble {
    String scword ="";
    int charScore = 0;
    List<Character> onepoint = Arrays.asList('A','E','I','O','U','L','N','R','S','T');
    List<Character> twopoint = Arrays.asList('D','G');
    List<Character> threepoint = Arrays.asList('B','C','M','P');
    List<Character> fourpoint = Arrays.asList('F','H','V','W','Y');
    List<Character> fivepoint = Arrays.asList('K');
    List<Character> eightpoint = Arrays.asList('J','X');
    List<Character> tenpoint = Arrays.asList('Q','Z');

    Map<List<Character>,Integer> pointMap = new HashMap<>();
                              
    Scrabble(String word) {
        this.scword = word;
        pointMap.put(onepoint, 1);
        pointMap.put(twopoint, 2);
        pointMap.put(threepoint, 3);
        pointMap.put(fourpoint, 4);
        pointMap.put(fivepoint, 5);
        pointMap.put(eightpoint, 8);
        pointMap.put(tenpoint, 10);
    }

    int getScore() {
        char[] scrabbleWordArray = scword.toCharArray();
        for(int i=0; i<scrabbleWordArray.length;i++){
            char c = scrabbleWordArray[i];
            int value = 0;
            if(onepoint.contains(c)|| onepoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(onepoint);
                charScore+=value;
            }else if(twopoint.contains(c)|| twopoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(twopoint);
                charScore+=value;
            }else if(threepoint.contains(c)|| threepoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(threepoint);
                charScore+=value;
            }else if(fourpoint.contains(c)|| fourpoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(fourpoint);
                charScore+=value;
            }else if(fivepoint.contains(c)|| fivepoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(fivepoint);
                charScore+=value;
            }else if(eightpoint.contains(c)|| eightpoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(eightpoint);
                charScore+=value;
            }else if(tenpoint.contains(c)|| tenpoint.contains(Character.toUpperCase(c))){
                value = pointMap.get(tenpoint);
                charScore+=value;
            }

        }

        return charScore;

    }

   
    public static void main(String args[]) {
        
        Scrabble sctemp = new Scrabble("CABBAGE");

        System.out.println(sctemp.getScore());

    }

}
