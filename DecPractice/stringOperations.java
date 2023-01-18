public class stringOperations {


    public static void main(String args[]){

        String a = "MADAM";
        String b = "SA";

 //      System.out.println(lexicographyCheck(a,b)); 
 //      System.out.println(concatOps(a,b));
       System.out.println(subStringOps(a,b));
    }
    
    public static boolean subStringOps(String a, String b){

        return (a.contains(b))?true:false;

        // if(a.contains(b)){
        //     return true;
        // }
        // return false;
    }

    public static String concatOps(String a, String b){
        String addedString = null;
        addedString = a.concat(b);
        return addedString;
    }

    public static boolean lexicographyCheck(String a, String b){
        boolean result = false;
        if(a.length()==b.length()){
            if( a.compareTo(b)==0){
                return true;
            }
        }

        return result;
    }
}
