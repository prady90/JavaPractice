import java.util.Arrays;
import java.util.Collections;

public class sortAscDescStringArrays {

    public static void main (String args[]){

        String[] input = { "meanwhile", "the", "correct", "way"};

//      Ascending order
        Collections.sort(Arrays.asList(input));
        System.out.println(Arrays.asList(input).toString());

//      Descending order
        Collections.sort(Arrays.asList(input), Collections.reverseOrder());
        System.out.println(Arrays.asList(input).toString());

    }
    
}
