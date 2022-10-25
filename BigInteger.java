
import java.util.*;


public class BigInteger {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc=new Scanner(System.in);
        
     java.math.BigInteger A = new java.math.BigInteger(sc.next());
     java.math.BigInteger B = new java.math.BigInteger(sc.next());

     System.out.println(A.add(B));
     System.out.println(A.multiply(B));
     sc.close();
        


    

    }
}