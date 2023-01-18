package Exercism;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final static List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
       // throw new UnsupportedOperationException("Please implement the isEmpty() method");
       return (languages.isEmpty()) ? true : false;
       //languages.
    }

    public void addLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the addLanguage() method");
    }

    public void removeLanguage(String language) {
        throw new UnsupportedOperationException("Please implement the removeLanguage() method");
    }

    public String firstLanguage() {
        throw new UnsupportedOperationException("Please implement the firstLanguage() method");
    }

    public int count() {
        throw new UnsupportedOperationException("Please implement the count() method");
    }

    public static boolean containsLanguage(String language) {
        return languages.contains(language) ? true : false;
    }

    public boolean isExciting() {
        //  throw new UnsupportedOperationException("Please implement the isExciting() method");
          boolean result = false;
        if(LanguageList.containsLanguage("Java")|| LanguageList.containsLanguage("Kotlin")){
            result = true;
        }
          return result;
      }
}
