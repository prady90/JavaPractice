
import java.util.*;


public class ExceptionHandling1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        
       try{
           int x = sc.nextInt();
           int y = sc.nextInt();
           
           int sum = x/y;
           System.out.println(sum);
           sc.close();
       }
       catch(Exception e){
        if(e instanceof ArithmeticException){
            System.out.println(e);
        }else if( e instanceof InputMismatchException){
            System.out.println(e.getClass().getName());
        }
           //System.out.println(e.getClass().getName());
       }

    }
}
