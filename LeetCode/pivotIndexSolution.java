package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class pivotIndexSolution {

    
    
    public static void main(String args[]) throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        for(int i=0; i<nums.length; i++){
            nums[i] = Integer.parseInt(br.readLine());
        }
        
        if(pivotIndex(nums)==-1){
            System.out.println("No pivot index");
        }else{
            System.out.println("pivot index is: "+pivotIndex(nums));
        }
    }
    private static int pivotIndex(int[] nums) {
        int sum = 0, leftsum = 0;
        for (int x: nums){
            sum+=x;
        }
        for (int i=0; i<nums.length; i++){
           
            int rightsum = sum- leftsum - nums[i];
        
            if(leftsum  ==rightsum){
                return i;
            }
            leftsum+=nums[i];
        }

        return -1;
    }
    
}
