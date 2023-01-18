package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;

class Flattener {
    Flattener() {
    }
   // List<Object> outputList = new ArrayList<>();
    List<Object> flatten(List inputSourceList) {
        List<Object> outputList = new ArrayList<>();
        for (Object o : inputSourceList) {
            if(o instanceof List){
                outputList.addAll(flatten((List) o));
            }else if(o!=null){
                outputList.add(o);
            }
        }
        
        return outputList;

    }

    public static void main(String[] args) {
        Flattener flattener = new Flattener();
        List temp = flattener.flatten(asList("0", 2, asList(asList("two", '3'), "8", singletonList(singletonList("one hundred")),
                null, singletonList(singletonList(null))), "negative two"));

        System.out.println(Arrays.asList(temp).toString());

    }

}
