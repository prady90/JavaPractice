import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SimpleProbs {

    public static void main(String args[]) {

        // printAnInteger();
        // add2Integers();
        // multiplyFloatInputs(581216732.323433f,7.83684987683688f);
        // getAsciiValue(';');
        // getQuotientandReminder(25,4);
        // swapNumbers(25,4);
        // oddOrEven(11);
        // vowelOrConsonant("z");
        // biggestOf3(6, 67,8);
        // quadraticRoots(2.3,4,5.6);
        // quadraticRoots(1,-5,6);
        // isPositiveOrNegative(-2);
        // isCharacterOrNot('9');
        // sumOf_N_NaturalNumbers(100);
        // System.out.println(factorialOfN(7));
        // mulitplicationTable(6,12);
        //fibonacciSeries(10);
        reverseNumber(12863928);
    }


    public static void reverseNumber(int a){
        //Approach 1
        // if(a!=0){
        //     int reversed = 0;
        //     String x = String.valueOf(a);
        //     String[] x1 = x.split("");
        //     Collections.reverse(Arrays.asList(x1));
        //     StringBuilder sb = new StringBuilder();
        //     for(int i=0; i<x1.length; i++){
        //         sb.append(x1[i]);
        //     }
        //     reversed = Integer.valueOf(sb.toString());
        //    // System.out.println(reversed);
        
        // }

        //Approach 2
        int reversedNum = 0;
        if(a!=0){
            while(a>0){
                int temp = a%10;
                reversedNum = reversedNum * 10 +temp;
                a = a/10;
            }
            System.out.println(reversedNum);
        }
    }


    public static void fibonacciSeries(int length) {

        int firstSeriesItem = 0;
        int secondSeriesItem = 1;
        int nextTerm = 0;

        List<Integer> fibSeries = new ArrayList<>();
        fibSeries.add(firstSeriesItem);
        fibSeries.add(secondSeriesItem);

        for (int i = 1; i < length; i++) {
            nextTerm = firstSeriesItem + secondSeriesItem;
            fibSeries.add(nextTerm);
            firstSeriesItem = secondSeriesItem;
            secondSeriesItem = nextTerm;
        }
        System.out.println(Arrays.asList(fibSeries.toString()));

    }

    public static void mulitplicationTable(int multiplyTableNumber, int lengthOfMultiplyTable) {
        for (int i = 1; i <= lengthOfMultiplyTable; i++) {
            System.out.println(multiplyTableNumber + " * " + i + " = " + multiplyTableNumber * i);
        }

    }

    public static int factorialOfN(int n) {
        if (n == 0) {
            System.out.println("Factorial of" + n + ": 1");

        }
        return n * factorialOfN(n - 1);
    }

    public static void sumOf_N_NaturalNumbers(int n) {

        int sum = 0;
        sum = (n * (n + 1)) / 2;
        System.out.println(sum);

    }

    public static void isCharacterOrNot(char c) {
        System.out.println(Character.isAlphabetic(c) ? true : false);
    }

    public static void isPositiveOrNegative(int a) {
        System.out.println((a > 0) ? "Positive" : "Negative");
    }

    public static void quadraticRoots(double a, double b, double c) {

        double determinant = Math.pow(b, 2) - (4 * a * c);
        double root1, root2;
        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println(root1 + "\n" + root2);
        } else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }

    }

    public static void biggestOf3(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("a is greatest");
        } else if (c > b && c > a) {
            System.out.println("c is greatest");
        } else {
            System.out.println("b is greatest");
        }

    }

    public static void vowelOrConsonant(String c) {
        List<String> vowels = Arrays.asList("a", "e", "i", "o", "u");
        System.out.println((vowels.contains(c)) ? "vowel" : "consonant");

    }

    public static void oddOrEven(int a) {
        System.out.println((a % 2 == 0) ? "even" : "odd");
    }

    public static void swapNumbers(int a, int b) {
        a = b + a;
        b = a - b;
        a = a - b;
        System.out.println(a + " , " + b);
    }

    public static void getQuotientandReminder(int a, int b) {
        System.out.println("quotient is: " + a / b + " remainder is: " + a % b);
    }

    public static void getAsciiValue(char c) {
        int temp = c;
        System.out.println(temp);
    }

    public static void printAnInteger() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer to be printed");
        int n = sc.nextInt();
        System.out.println("integer to be printed is: " + n);
        sc.close();
    }

    public static void add2Integers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st integer");
        int n = sc.nextInt();
        System.out.println("Enter the 2nd integer");
        int m = sc.nextInt();
        System.out.println("sum of integers: " + (n + m));
        sc.close();
    }

    public static void multiplyFloatInputs(float a, float b) {
        System.out.println("product of inputs: " + (a * b));
    }
}
