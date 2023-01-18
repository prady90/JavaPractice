// take an array - int, take a value n = is less than length of the array.
//1,2,3,4,5 - 

// string with alpha numeric characters, Ex: bc123de, bc_de : 123def  then def

public class testManipulations{

public static void main(String args[]){

String inputString = "123def";
/*int n = 2;
int[] a = {4,7, 8, 2, 1}; */
//getNValuefromDescendingArray(a,n); 
//getNValue_AlternateWay(a,n);
stringOpsManipulate(inputString);

}

public static void getNValuefromDescendingArray(int[] a, int n){
    int temp =0;
    for(int i=0; i<a.length; i++){
        for(int j=0; j<a.length; j++){
            if(a[i]>a[j]){
                temp = a[i];
                a[i]= a[j];
                a[j]= temp;
            }
        }
    }
    System.out.println(a[n-1]);
}


public static int[] getNValue_AlternateWay(int[] a, int n){
    int temp =0;
    for(int i=0; i<a.length; i++){
        for(int j=i+1; j<a.length; j++){
            if(a[i]<a[j]){
                temp = a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
        
       
    }
    return a;
}


public static String stringOpsManipulate(String inputString){

    char[] inputArray = inputString.toCharArray();
    
    String temp ="";
    for(int i=0; i<inputArray.length; i++){
        char ch = inputArray[i];
        if(Character.isDigit(ch)){
            temp+=ch;
        }
    }
    String x = inputString.replace(temp, "_");

    return x;
}

}

