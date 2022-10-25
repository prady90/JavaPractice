import java.io.*;
import java.util.*;

public class DynamicArrayList {

    public static void main(String[] args) throws IOException, NumberFormatException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> listofLines = new ArrayList<>(); 
        List<List<Integer>> listofQueries = new ArrayList<>(); 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int noOfLines = Integer.parseInt(br.readLine());
        
        for(int i=0; i<noOfLines; i++ ){
            String[] tempStr = br.readLine().split(" "); 
            List<Integer> tempList = new ArrayList<>();
            for(int j=0; j< tempStr.length-1; j++){
                int items = Integer.parseInt(tempStr[j+1]);
                tempList.add(items);
            }
            listofLines.add(tempList);
            System.out.println(Arrays.asList(listofLines.toString()));
            
        }

        int noOfQueries = Integer.parseInt(br.readLine());

        for(int a=0; a<noOfQueries; a++){
            String[] tempStr = br.readLine().split(" "); 
            List<Integer> tempQueryList = new ArrayList<>();
            for(int j=0; j< tempStr.length; j++){
                int items = Integer.parseInt(tempStr[j]);
                tempQueryList.add(items);
            }
            listofQueries.add(tempQueryList);
            System.out.println(Arrays.asList(listofQueries.toString()));
        }

        for(int b=0; b<noOfQueries; b++){

            List<Integer> queryType = listofQueries.get(b);
         
            int linenumber = queryType.get(0)-1;
            int elementnumber = queryType.get(1)-1;

            List<Integer> output = listofLines.get(linenumber);

            if(elementnumber>=output.size() || elementnumber<0 || linenumber >= listofLines.size() || linenumber < 0){
                System.out.println("ERROR!");
            }else{
                int finalOut = output.get(elementnumber);
                System.out.println(finalOut);
            }


            
            

        }
        
    }
    
}
