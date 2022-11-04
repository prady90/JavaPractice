package HackerRank.Easy;

import java.io.*;
import java.util.*;




public class TwoDArrayHourGlass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();
        int sampleArray[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
            
            //to get the items in the list to an 2 D array
             for(int a=0; a<arr.size();a++){
            List<Integer> temp = arr.get(a);
            for(int b=0; b<temp.size(); b++){
                sampleArray[a][b]= temp.get(b);
            }
         }

         }    
            int biggerNum = Integer.MIN_VALUE; /*( set the least value possible to the int variable and keep replacing this variable with a higher value upon successful comparison  */
        
       for(int i=0; i<4; i++){ /* loop thru rows */
        for(int j=0; j<4; j++){ /*loop thru columns*/ /* this multi for loop is how you loop through an 2D array */

            int sum = sampleArray[i][j]+ sampleArray[i][j+1] + sampleArray[i][j+2] + sampleArray[i+1][j+1] + sampleArray[i+2][j]
                + sampleArray[i+2][j+1] + sampleArray[i+2][j+2];

               // System.out.println (sampleArray[i][j]+"\n");
             //System.out.println("the sum is " + sum + "\n");

                biggerNum = Math.max(biggerNum, sum);
        }

       }

       System.out.println(biggerNum);
        bufferedReader.close();
    }
            
        }
        
     

