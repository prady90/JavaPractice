import java.util.HashSet;
import java.util.Scanner;

public class hashset {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        s.nextLine();
        HashSet<String> pairs = new HashSet<String>();
        String[] combined = new String[t];
        for (int i = 0; i < t; i++) {
         
            combined[i] = s.nextLine();
        }

    for(int i=0; i<t; i++){
      
        pairs.add(combined[i]);
        System.out.println(pairs.size());
    }
s.close();
   }
}