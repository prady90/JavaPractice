package HackerRank.Easy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;



public class bitSets {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");

        int n = Integer.parseInt(a[0]);
        int m = Integer.parseInt(a[1]);
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int j = 0; j < m; j++) {
            String[] a1 = br.readLine().split(" ");
            String operation = a1[0];
            int x = Integer.parseInt(a1[1]);
            int y = Integer.parseInt(a1[2]);
            switch (operation) {
                case "AND":
                    if (x == 1) {
                        b1.and(b2);
                        break;
                    } else if (x == 2) {
                        b2.and(b1);
                        break;
                    }
                case "SET":
                    if (x == 1) {
                        
                        b1.set(y, true);

                        break;
                    } else if (x == 2) {
                        
                        b2.set(y, true);

                        break;
                    }
                case "FLIP":
                    if (x == 1) {
                        b1.flip(y);

                        break;
                    } else if (x == 2) {
                        b2.flip(y);

                        break;
                    }
                case "OR":
                    if (x == 1) {
                        b1.or(b2);

                        break;
                    } else if (x == 2) {
                        b2.or(b1);

                        break;
                    }
                case "XOR":
                    if (x == 1) {
                        b1.xor(b2);

                        break;
                    } else if (x == 2) {
                        b2.xor(b1);

                        break;
                    }

            }   
            System.out.println(b1.cardinality() + " " + b2.cardinality());
           
        }

        br.close();

    }

}
