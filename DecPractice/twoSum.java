import java.util.Arrays;

class twoSumClass {

    public static void main(String args[]) {

        int[] nums = { 2,7,11,15 };
        twoSum(nums, 9);

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i+1; j < nums.length; j++) {

                if (temp + nums[j] == target) {
                    output[0] = i;
                    output[1] = j;

                    System.out.println(Arrays.toString(output));

                }
            }
        }
        return output;

    }
}