

public class sumOfArrayValuesandPrintPattern {

    public static void main(String args[]){

       int[] input =  { 7, 3, 2, 4, 1, 2 };
       System.out.println(addArray(input));
       printPattern();
    }

    public static int addArray(int[] input){
        int sum = 0;
        for(int i: input){
         sum+=i;
        }
        
        return sum;
        

    }

    public static void printPattern(){
        String[][] pattern = new String[10][10];
        for(int i=0; i<pattern.length; i++){
            for(int j=0; j<pattern.length; j++){
                pattern[i][j]="-";
            }
        }
        
        for(int i=0; i<pattern.length; i++){
            for(int j=0; j<pattern.length; j++){
                System.out.print(pattern[i][j]);
            }
            System.out.print("\n");
        }
        
    }
    
}

