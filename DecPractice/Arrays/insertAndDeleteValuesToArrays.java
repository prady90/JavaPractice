import java.util.Arrays;

public class insertAndDeleteValuesToArrays {

    public static void main(String args[]) {

        int[] input = { 7, 3, 2, 4, 1, 2 };
        int ArrayPosition = 3;
        int arrayValue = 9;
        System.out.println(Arrays.toString(input));
        System.out.println(Arrays.toString(insertValuesInArray(input, ArrayPosition, arrayValue)));
        deleteValuesInArray(input,ArrayPosition);

    }

    public static int[] insertValuesInArray(int[] input, int ArrayPosition, int arrayValue) {
        int temp = 0;
        for (int i = 0; i < input.length; i++) {
            if (i == ArrayPosition) {
                temp = input[i];
                input[i] = arrayValue;
            } else if (i > ArrayPosition) {
                int temp1 = input[i];
                input[i] = temp;
                temp = temp1;
            }

        }

        return input;
    }



    public static int[] deleteValuesInArray(int[] input, int ArrayPosition){
        int[] output = new int[input.length-1];
        return output;
    }

}
