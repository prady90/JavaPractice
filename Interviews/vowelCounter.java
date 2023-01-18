import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class vowelCounter{

public static void main(String args[]){


String input = "Telephone";

List<String> vowels = Arrays.asList("a","e","i","o","u");

//findVowels(input, vowels);
//vowelNums(input);
vowelIterations(input);
}

public static int  findVowels(String input, List<String> vowels){
    
    int vowelCounter = 0;
    for(int i=0; i<input.length(); i++){
        char c = input.charAt(i);
        if(vowels.contains(Character.toString(c))){
            vowelCounter++;
        }

    }
    System.out.println(vowelCounter);
    return vowelCounter;
}

public static Map<String,Integer> vowelIterations(String input){
    Map<String,Integer> vowelMap = new HashMap<>();
    vowelMap.put("a", 0);
    vowelMap.put("e", 0);
    vowelMap.put("i", 0);
    vowelMap.put("o", 0);
    vowelMap.put("u", 0);
    //List<String> vowels = Arrays.asList("a","e","i","o","u");
    
    for(int j=0; j<input.length(); j++){
       
        char c = input.charAt(j);
        String temp = String.valueOf(c);
        if(vowelMap.containsKey(temp)){
            int value = vowelMap.get(temp);
            vowelMap.put(temp, value+1);
        }

    }
    return vowelMap;

}


public static void vowelNums(String input){
    
    int a =0;
    int e = 0;
    int i=0;
    int o =0;
    int u=0;

    for(int j=0; j<input.length(); j++){
        char c = input.charAt(j);
        if(c=='a'){
           a++;    
        }else if(c=='e'){
            e++;
        }else if(c=='i'){
            i++;
        }else if(c=='o'){
            o++;
        }else if(c=='u'){
            u++;
        }

    }
    System.out.println("values of a:"+a);
    System.out.println("values of e:"+e);
    System.out.println("values of i:"+i);
    System.out.println("values of o:"+o);
    System.out.println("values of u:"+u);
}


}