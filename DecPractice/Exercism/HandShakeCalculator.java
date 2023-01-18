package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
    List<Signal> handshakeList = new ArrayList<Signal>();
    List<Signal> calculateHandshake(int number) {

        String str = Integer.toBinaryString(number);
       
                
                    if( str.charAt(str.length()-1)=='1'){
                        System.out.println(str.charAt(str.length()-1));
                        handshakeList.add(Signal.WINK);
                    }
                    if(str.length()>1 && str.charAt(str.length()-2)=='1'){
                        handshakeList.add(Signal.DOUBLE_BLINK);
                    }
                    if(str.length()>2 && str.charAt(str.length()-3)=='1'){
                        handshakeList.add(Signal.CLOSE_YOUR_EYES);
                    }
                    if(str.length()>3 && str.charAt(str.length()-4)=='1'){
                        handshakeList.add(Signal.JUMP);
                    }
                    if(str.length()>4 && str.charAt(str.length()-5)=='1'){
                        Collections.reverse(handshakeList);
                    }
                
                

            
            // need to start this for loop from left to right.
            
        
        System.out.println(Arrays.asList(handshakeList));
        return handshakeList;
    }

    public static void main(String[] args) {
        HandshakeCalculator hc = new HandshakeCalculator();
        hc.calculateHandshake(8);
    }

}
enum Signal {

    WINK, DOUBLE_BLINK, CLOSE_YOUR_EYES, JUMP

}