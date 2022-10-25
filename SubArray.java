
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * We define the following:

A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
The sum of an array is the total sum of its elements.
An array's sum is negative if the total sum of its elements is negative.
An array's sum is positive if the total sum of its elements is positive.
Given an array of  integers, find and print its number of negative subarrays on a new line.

Input Format

The first line contains a single integer, , denoting the length of array .
The second line contains  space-separated integers describing each respective element, , in array .

Constraints

Output Format

Print the number of subarrays of  having negative sums.

Sample Input

5
1 -2 4 -5 1
Sample Output

9
Explanation
1+-2
1+-2+4+-5 ...
etc

There are nine negative subarrays of :

Thus, we print  on a new line.
 */

public class SubArray {

    public static void main(String[] args) throws IOException, NumberFormatException {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int lengthOfArray = Integer.parseInt(br.readLine());
        String[] arrRowTempItems = br.readLine().split(" ");

        int[] a = new int[lengthOfArray];
        for (int i = 0; i < arrRowTempItems.length; i++) {
            a[i] = Integer.parseInt(arrRowTempItems[i]);
        }
 
        int count = 0;
        for (int j=0; j<a.length; j++){
            int sum = 0;
            for(int j1=j; j1<a.length;j1++){
                sum += a[j1];
                if(sum < 0){
                    count++;
                }
            }
            

        }
        System.out.println(count);
    }
}