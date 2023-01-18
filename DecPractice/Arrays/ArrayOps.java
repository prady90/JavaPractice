import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;


/*
 * 
 * import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

public static void main(String[] args) {
    double[][] data = {{1,2,3},{4,5,6}};
    RealMatrix matrix = new Array2DRowRealMatrix(data);
    RealMatrix transpose = matrix.transpose();
    // transpose is now the transpose of the original matrix
}
 * 
 * 
 * 
 * 
 */

public class ArrayOps {
     
public static void main(String[] args) { 
// addMatrices();
// multiplyMatrices();
//  transposeMatrix();
// transposeMatrixWithApache();
//    concatArrays();
findValuesInArray();
}

public static void addMatrices(){
    Scanner sc = new Scanner(System.in);

    int[][] inputMatrix1 = new int[2][2];
    int[][] inputMatrix2 = new int[2][2];

    System.out.println("Enter the values for first matrix below:");
    for(int i=0; i<inputMatrix1.length;i++){
        for(int j=0; j<inputMatrix1.length;j++){
            inputMatrix1[i][j]= sc.nextInt();
        }
    }
    System.out.println("Enter the values for second matrix below:");
    for(int i=0; i<inputMatrix2.length;i++){
        for(int j=0; j<inputMatrix2.length;j++){
            inputMatrix2[i][j]= sc.nextInt();
        }
    }
    sc.close();
    int[][] outputMatrix = new int[2][2];
    for(int a=0; a<outputMatrix.length;a++){
        for(int b=0;b<outputMatrix.length; b++){
            outputMatrix[a][b] = inputMatrix1[a][b] + inputMatrix2[a][b];
        }
    }
    System.out.println(Arrays.deepToString(outputMatrix));
}

public static void multiplyMatrices(){

    Scanner sc = new Scanner(System.in);
    int[][] inputMatrix1 = new int[2][3];
    int[][] inputMatrix2 = new int[3][2];

    int r1 = 2;
    int r2 = 3;
    int c1 = 3;
    int c2 = 2;



    System.out.println("Enter the values for first matrix below:");
    for(int i=0; i<r1;i++){
        for(int j=0; j<c1;j++){
            inputMatrix1[i][j]= sc.nextInt();
        }
    }
    System.out.println("Enter the values for second matrix below:");
    for(int i=0; i<r2;i++){
        for(int j=0; j<c2;j++){
            inputMatrix2[i][j]= sc.nextInt();
        }
    }
    sc.close();
    
    int[][] outputMatrix = new int[r1][c2];
    int sum = 0;

    for(int i=0; i<r1; i++){ // iterate rows
        for( int j=0; j<c2; j++){ // iterate columns
          for(int k=0; k<c1; k++){
            sum += inputMatrix1[i][k] * inputMatrix2[k][j];
            outputMatrix[i][j]=sum;
            System.out.println(inputMatrix1[i][k]+"*"+inputMatrix2[k][j]+"=(prevSum+currentSum)"+sum);
            System.out.println(Arrays.deepToString(outputMatrix));
          }
            
        }
    }
    

}

public static void transposeMatrix(){

    Scanner sc = new Scanner(System.in);
    int[][] inputMatrix1 = new int[2][3];
    int r1 = 2;
    int c1 = 3;
    int r2 = 0;
    int c2 = 0;

    // To transpose a matrix
    c2=r1;
    r2=c1;
    int[][] outputMatrix = new int[r2][c2];
    System.out.println("Enter the values for first matrix below:");
    for(int i=0; i<r1;i++){
        for(int j=0; j<c1;j++){
            inputMatrix1[i][j]= sc.nextInt();
        }
    }

    for(int a=0; a<r2; a++){
        for(int b=0; b<c2; b++){
            outputMatrix[a][b]= inputMatrix1[b][a];
        }
    }
    sc.close();

   

    System.out.println(Arrays.deepToString(outputMatrix));
    
}


public static void transposeMatrixWithApache(){
    double[][] data = {{1,2,3},{4,5,6}};
    RealMatrix matrix = new Array2DRowRealMatrix(data);
    RealMatrix transpose = matrix.transpose();
    System.out.println(transpose);
}


public static void concatArrays(){

    int[] array1 = {1, 2, 3};
    int[] array2 = {4, 5, 6};

    int[] concatenatedArray = new int[array1.length+array2.length];

    int pos = 0;
    for (int element : array1) {
        concatenatedArray[pos] = element;
        pos++;
    }

    for (int element : array2) {
        concatenatedArray[pos] = element;
        pos++;
    }

    System.out.println(Arrays.toString(concatenatedArray));

}

public static void findValuesInArray(){

int[] input = {2,3,5,6,9,13,15};
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value to be found");
int valueToBeFound = sc.nextInt();
boolean valuefound = false;
for(int i: input){
    if(i==valueToBeFound){
        valuefound = true;
        break;
    }
}
sc.close();
System.out.println(valuefound?"value found":"value not found");



}

}


