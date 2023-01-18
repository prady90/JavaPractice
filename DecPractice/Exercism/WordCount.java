package Exercism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class WordCount {
  /*   
    WordCount(){
    }
    List<String> check = new ArrayList<>();
    Map<String,Integer> output = new HashMap<>();
    public Map<String, Integer> phrase(String input) {
        
        String[] a = input.replaceAll("[^\\w+']", " ").split(" ");

        for( String s: a){
            if(s.equals("")){
                continue;
            }else{
                if(s.matches("'\\w+")||s.matches("\\w+'")||s.matches("'\\w+'")){
                   s= s.replaceAll("[\']", "");
                    check.add(s);
                }else{
                    check.add(s);
                }
            }
        }
    
        for(String s1:check){
            int i=0;
            if(output.get(s1.toLowerCase())!=null){
                int temp = output.get(s1.toLowerCase());
                output.replace(s1.toLowerCase(), temp+1);
            }else{
                output.put(s1.toLowerCase(), i+1);
            }

        }

        //input.split(\n|\s|:|!|,|\.|\"|(\w+'\w+));
       // System.out.println(Arrays.toString(a));
       // System.out.println(a);
        return output;
    }
*/
    public static void main(String[] args) {
        WordCount wc = new WordCount();
        wc.phrase("\"That's the password: 'PASSWORD 123'!\", cried the Special Agent.\nSo I fled");
    }
    public Map<String, Integer> phrase(String input) {
        Map<String, Integer> res = new HashMap<String, Integer>();
        for (String word : input.toLowerCase().split("\\s+|,")) {
          word = word.replaceAll("^\\p{Punct}+|\\p{Punct}+$", "");
          if (word.length() == 0) {
            continue;
          }
          incrementCount(res, word);
        }
        return res;
      }
      private void incrementCount(Map<String, Integer> map, String word) {
        if (!map.containsKey(word)) map.put(word, 0);
        int crnt = map.get(word);
        map.put(word, crnt + 1);
      }
    
}


