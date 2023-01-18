import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class sortAscDescIntArrays {

    public static void main(String args[]) {

        int[] input = { 7, 3, 2, 4, 1, 2 };
        // sort ascending using Lists
        System.out.println(Arrays.asList(sortAscManuallyWithLists(input)).toString());

        //sort descending using Arrays.sort
        System.out.println( Arrays.asList(sortAscManuallyWithArrays(input)).toString());

    }

    public static int[] sortAscManually(int[] input){

        for (int i = 0; i < input.length; i++) {

            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }

            }

        }
        return input;
    }


    public static List<Integer> sortAscManuallyWithLists(int[] input){
        List<Integer> output = new ArrayList<>();
        for(int i=0; i<input.length;i++){
            output.add(input[i]);
        }

        Collections.sort(output); // sort ascending
      //  Collections.sort(output,Collections.reverseOrder()); sort descending

        return output;
    }


    public static Integer[] sortAscManuallyWithArrays(int[] input){

        Integer[] output = new Integer[6];
        for(int i=0; i<input.length; i++){
            output[i] = input[i];
        }
        Arrays.sort(input); // ascending
         Arrays.sort(output, Collections.reverseOrder()); // descending

       // return input;
       return output;

    }

}
