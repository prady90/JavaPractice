import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaListSecondAttempt {

    /*Question wants you to use list to get the input array of number from SysIn */

    public static void main (String args[]) throws NumberFormatException{
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> L = new ArrayList<>();
        for(int i=0; i<N; i++){
            L.add(sc.nextInt());
        }
        int Q = sc.nextInt();
        for(int j=0; j<Q; j++){
            String command = sc.nextLine();
            if(command.equals("")){
                command = sc.nextLine();
            }
            if(command.equals("Insert")){
                int x = sc.nextInt();
                int y = sc.nextInt();
                L.add(x, y);             
            } 
            if(command.equals("Delete")){
                int x = sc.nextInt();
                L.remove(x);
            }
            
        }
        sc.close();
        for(int print =0; print<L.size(); print++){
            System.out.print(L.get(print)+" ");
        }
    }
    
}


