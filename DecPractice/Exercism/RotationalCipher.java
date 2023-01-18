package Exercism;

import java.util.HashMap;
import java.util.Map;

/*        V W X Y Z A B C D E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S  T  U  
          A B C D E F G H I J  K  L  M  N  O  P  Q  R  S  T  U  V  W  X  Y  Z
          1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26
          T U V W X Y Z A B C  D  E  F  G  H  I  J  K  L  M  N  O  P  Q  R  S
                       */

class RotationalCipher {
    // List<String> plainCipher = new ArrayList<>();

    String alphabetString = "abcdefghijklmnopqrstuvwxyz";
    String cipherString = "";
    Map<Integer, String> alphaList = new HashMap<Integer, String>();

    RotationalCipher(int shiftKey) {

        for (int i = 0; i < alphabetString.length(); i++) {
            if (Character.isAlphabetic(alphabetString.charAt(i))) {
                char c = alphabetString.charAt(i);
                int pos = alphabetString.indexOf(Character.toString(c));
                int newPos = (pos + shiftKey) % 26;
                alphaList.put(newPos, Character.toString(c));
            }

        }

        for (Map.Entry<Integer,String> m : alphaList.entrySet()) {
            cipherString += m.getValue();
        }
    }

    String rotate(String data) {
        String encryptedData = "";
        for (int i = 0; i < data.length(); i++) {
            char c = data.charAt(i);
            if (!Character.isLetter(c)) {
                encryptedData += data.charAt(i);
            } else {
                if (Character.isUpperCase(c)) {
                    int pos = cipherString.toUpperCase().indexOf(Character.toString(c));
                    encryptedData += alphabetString.toUpperCase().charAt(pos);
                } else {
                    int pos = cipherString.indexOf(Character.toString(c));
                    encryptedData += alphabetString.charAt(pos);
                }
            }
        }
        return encryptedData;
    }

    public static void main(String[] args) {
        RotationalCipher rc = new RotationalCipher(4);
        System.out.println(rc.rotate("Testing 1 2 3 testing")); // TIIEX

        // String alphabetString = "abcdefghijklmnopqrstuvwxyz";
        // String alphabetStringUpper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // for (int i = 0; i < alphabetString.length(); i++) {

        //     int j = alphabetString.charAt(i);
        //     int k = alphabetStringUpper.charAt(i);
        //     System.out.println(alphabetString.charAt(i) + " : " + j + "," + alphabetStringUpper.charAt(i) + " : " + k);
        //     // System.out.println(alphabetString.toUpperCase().charAt(i)+" : "+j);
        // }

    }

}
