import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class CharacterCount{

public static void main(String args[]) throws IOException{

   
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input = br.readLine();
    int n = input.length();
    System.out.println(n);
    for(int a=0; a<input.length(); a++){
        int count =0;
        char temp = input.charAt(a);

        for(int b=1; b<input.length(); b++){
            if(temp==input.charAt(b)){
                count++;
            }
        }
        System.out.println("the occurences of "+temp+"  are "+count);
    }

}

}