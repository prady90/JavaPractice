

public class averageOfArraysAndNumbertoFind {

    public static void main(String args[]){

        int[] input = { 7, 3, 2, 4, 1, 2 };
        average(input);
        numberToFind(input,2);

    }

    private static void average(int[] input) {
        int sum=0;
        for(int i=0; i<input.length; i++){
            sum+=input[i];
        }

        float average = sum/(input.length);
        System.out.println(average);
    }

    private static void numberToFind(int[] input, int findNum){
        int count = 0;
        for(int i=0; i<input.length; i++){
            if(input[i]==findNum){
                count++;
                System.out.println("Found "+findNum+" at index:"+i);
            }
        }
        System.out.println("total occurences: "+count);

    }
    
}
