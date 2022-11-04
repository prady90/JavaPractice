    package HackerRank.Easy;
import java.util.Scanner;

public class SamplePractice {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
      
    int i =1;


    while(sc.hasNext()){
            int j=i+1;
            System.out.println(j + " " + sc.nextLine());
            
        }
        sc.close();
        
    }
  
}

final class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    int counter = 1;
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
        System.out.printf("%d %s\n",counter, in.nextLine());
        counter++;
    }
    in.close();
}
}
