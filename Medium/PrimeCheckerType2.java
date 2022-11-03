import java.io.*;
import java.util.*;

/*Print the list of numbers with prime*/

public class PrimeCheckerType2 {
    public static void main(String args[]) throws NumberFormatException, IOException {
        PrimeFind pf = new PrimeFind();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] primeArray = new int[5];
        for (int k = 0; k < primeArray.length; k++) {
            int n = Integer.parseInt(br.readLine());
            primeArray[k] = n;
        }
        List<Integer> primeList = new ArrayList<>();

        for(int m=0; m<primeArray.length; m++){
            primeList.add(primeArray[m]);
            if(primeList.size()!=0){
                List<Integer> finalList = new ArrayList<>();
                for(int a:primeList){
                    
                    boolean finalresult = pf.checkPrimeNumber(a);
                    if(finalresult){
                        
                        finalList.add(a);  
                    }
                    
                }
                System.out.println(Arrays.asList(finalList.toString()));

            }
        }

    }
}

class PrimeFind {

    boolean checkPrimeNumber(int... args) {
        boolean result = false;
        for (int i = 0; i < args.length; i++) {
            int count = 0;

            for (int j = 1; j <= args[i]; j++) {
                if (args[i] % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                result = true;
            }

        }

        return result;

    }

}
