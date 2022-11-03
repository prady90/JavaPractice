import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.print.attribute.standard.NumberUpSupported;

public class isPrimeNumber {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        isPrime(n);
        isPrimeUsingBigInt(n);

    }

    private static void isPrime(int n) {
        int count = 0;       
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count == 2) {
            System.out.println("its prime");
        } else {
            System.out.println("not a prime");
        }
    }

    private static void isPrimeUsingBigInt(int n){
        String a = String.valueOf(n);
        java.math.BigInteger b = new java.math.BigInteger(a);
        if(b.isProbablePrime(1)){
            System.out.println("its prime");
        }else{
            System.out.println("not a prime");
        }
        

    }

}
