package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class printInteger {
    static final Scanner scan = new Scanner(System.in);
public static void main (String args[]){
    
    int sampleInput = getIntInputsCmdLine();
    printIntegerValue(sampleInput);
   List<Integer> a = getMultipleIntInputsCmdLine();
    System.out.println(Arrays.asList(a.toString()));
    addNumbers(a.get(0), a.get(1));
    scan.close(); 


}
    private static int  getIntInputsCmdLine(){
       
        System.out.println("Enter your int value:");
        int  cmdLineInputs = scan.nextInt();
        scan.close();
        return cmdLineInputs;
    }
    /**
     * @return
     */
    private static List<Integer>  getMultipleIntInputsCmdLine(){
       
        List<Integer> inputList = new ArrayList<>();
       
        System.out.println("Enter your int value for x:");
       int  x = scan.nextInt();
       System.out.println("Enter your int value for y:");
       int  y = scan.nextInt();
        
       inputList.add(x);
        inputList.add(y);
      
       



    return inputList;
    }


   // Java Program to Print an Integer (Entered by the User)

   private static void printIntegerValue(int input){
    System.out.println(input);

   }

   private static void addNumbers(int a, int b){

    int sum = a+b;
    System.out.println("the sum value is: "+sum);

   }
    
}
