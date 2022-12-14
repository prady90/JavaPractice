import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import static java.lang.System.*;


public class PrimeChecker {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            try{
        BufferedReader br=new BufferedReader(new InputStreamReader(in));
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        int n3=Integer.parseInt(br.readLine());
        int n4=Integer.parseInt(br.readLine());
        int n5=Integer.parseInt(br.readLine());
        Prime ob=new Prime();
        ob.checkPrime(n1);
        ob.checkPrime(n1,n2);
        ob.checkPrime(n1,n2,n3);
        ob.checkPrime(n1,n2,n3,n4,n5);    
        Method[] methods=Prime.class.getDeclaredMethods();
        Set<String> set=new HashSet<>();
        boolean overload=false;
        for(int i=0;i<methods.length;i++)
        {
            if(set.contains(methods[i].getName()))
            {
                overload=true;
                break;
            }
            set.add(methods[i].getName());
            
        }
        if(overload)
        {
            throw new Exception("Overloading not allowed");
        }
        br.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    }


class Prime{

    void checkPrime(int...arr) {
        for (int i = 0; i < arr.length; i++) {
         boolean flag = false;
         for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
          if (arr[i] % j == 0) {
           flag = true;
           break;
          }
         }
         if (arr[i] > 1 && (!flag || arr[i] == 2)) {
          System.out.print(arr[i] + " ");
         }
        }
        System.out.println();
       }

}
