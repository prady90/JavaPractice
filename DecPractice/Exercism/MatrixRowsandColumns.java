package Exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * your code should be able to spit out:

A list of the rows, reading each row left-to-right while moving top-to-bottom across the rows,
A list of the columns, reading each column top-to-bottom while moving from left-to-right.
The rows for our example matrix:

9, 8, 7
5, 3, 2
6, 6, 7
And its columns:

9, 5, 6
8, 3, 6
7, 2, 7

Matrix can have unequal rows and columns
 */


class MatrixRowsandColumns {
    int[][] inputMatrix;
    List<String> rows = new ArrayList<>();
    String matrixString = "";
    MatrixRowsandColumns(String matrixAsString) {
       this.matrixString = matrixAsString;
       String[] a = matrixString.split("\n");
       inputMatrix = new int[a.length][];
       for(int i=0; i<a.length;i++){
        String[] temp = a[i].split(" ");
        inputMatrix[i] = new int[temp.length];
        for( int j=0; j<temp.length;j++){
                inputMatrix[i][j]=Integer.valueOf(temp[j]);
        }
       }
      // System.out.println(Arrays.toString(inputMatrix));
       }

    int[] getRow(int rowNumber) {
      
      //  System.out.println(Arrays.toString(inputMatrix[rowNumber-1]));
        return inputMatrix[rowNumber-1];
        
    }

    int[] getColumn(int columnNumber) {
       int[] columnMatrix = new int[inputMatrix.length];
        for( int a=0; a<columnMatrix.length;a++){
            columnMatrix[a]= inputMatrix[a][columnNumber-1];
        }
       System.out.println(Arrays.toString(columnMatrix));
       return columnMatrix;
    }

    public static void main(String[] args) {
        MatrixRowsandColumns mc = new MatrixRowsandColumns("1 2 3 4\n5 6 7 8\n9 8 7 6");
        mc.getRow(1);
        mc.getColumn(1);
    }
}
