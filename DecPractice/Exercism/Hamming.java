package Exercism;



public class Hamming {

    String lStrand;
    String rStrand;
    int HammingDistance = 0;
    
    public Hamming(String leftStrand, String rightStrand) throws IllegalArgumentException {
        this.lStrand = leftStrand;
        this.rStrand = rightStrand;
     if (!leftStrand.isEmpty() && rightStrand.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");
        if (!rightStrand.isEmpty() && leftStrand.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
        if (leftStrand.length() != rightStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
    }

    public int getHammingDistance() {
        char[] lStrandArray = lStrand.toCharArray();
        char[] rStrandArray = rStrand.toCharArray();
       
        for(int i=0; i<lStrandArray.length;i++){
            if(lStrandArray[i]!=rStrandArray[i]){
                HammingDistance+=1;
            }
        }
        return HammingDistance;
    }
}

