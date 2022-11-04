package HackerRank.Easy;
import java.io.*;
import java.util.*;


public class JavaList {

    public static void main(String[] args) throws IOException, NumberFormatException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        List<Integer> numList = new ArrayList<>();
        String[] arrList = br.readLine().split(" ");
        for(int i=0; i<n; i++){
            int temp = Integer.parseInt(arrList[i]);
            numList.add(temp);
        }
        List<String> commandList = new ArrayList<>();
        int queries = Integer.parseInt(br.readLine());
        List<List<String>> InsertPosition = new ArrayList<>();
        for(int j=0; j< queries; j++){
            String s = br.readLine();
            commandList.add(s);
            String[] opsPosition = br.readLine().split(" ");
            List<String> temp = new ArrayList<>();
            if(commandList.get(j).equals("Insert")){
                for(String s1: opsPosition){
                    temp.add(s1);
                }
                InsertPosition.add(temp);
            }else if(commandList.get(j).equals("Delete")){
                for(String s1: opsPosition){
                    temp.add(s1);
                }
                InsertPosition.add(temp);
            }

        }

        for(int i1=0; i1<commandList.size(); i1++){
            int x = 0;
            int y = 0;
            if(commandList.get(i1).equals("Insert")){
                List<String> tempS = InsertPosition.get(i1);
                if(!(tempS.size()>0)){
                   break;
                }
                x = Integer.parseInt(tempS.get(0));
                y = Integer.parseInt(tempS.get(1));
                numList.add(x, y);
            }else if(commandList.get(i1).equals("Delete")){
                List<String> tempS = InsertPosition.get(i1);
                if(!(tempS.size()>0)){
                    break;
                }
                x = Integer.parseInt(tempS.get(0));
                numList.remove(x);
            }
            

        }

       // System.out.println(Arrays.asList(commandList.toString()));
       // System.out.println(Arrays.asList(InsertPosition.toString()));
       // System.out.println(Arrays.asList(DeletePosition.toString()));
        System.out.println(Arrays.asList(numList.toString()));
        
    }
}