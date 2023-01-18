package Exercism;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {

    List<List<Integer>> inputMatrix = new ArrayList<>();
    Set<MatrixCoordinate> outputSet = new HashSet<>();
    Matrix(List<List<Integer>> values) {
                this.inputMatrix = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        // 9 8 7
        // 5 3 2
        // 6 6 7

        for(int row=0; row<inputMatrix.size();row++){
            for(int column=0; column<inputMatrix.get(0).size();column++){
                boolean verifySaddlePt = isSaddlePoint(row,column);
                if(verifySaddlePt){
                    MatrixCoordinate mc = new MatrixCoordinate(row+1, column+1);
                    outputSet.add(mc);
                }
            }
        }

        System.out.println(outputSet.toArray());
        return outputSet;
    }

    boolean isSaddlePoint(int row, int col){
        boolean saddlePtStatus = false;
        final int tempSaddle = inputMatrix.get(row).get(col);
        int newRowSaddle = 0;
        int newColumnSaddle = 0;
      
        List<Integer> rowSaddleList = new ArrayList<>();
        List<Integer> columnSaddleList = new ArrayList<>();

        rowSaddleList = inputMatrix.get(row);
        newRowSaddle = Collections.max(rowSaddleList);

        for(int i=0; i<inputMatrix.size(); i++){
            columnSaddleList.add( inputMatrix.get(i).get(col));
            newColumnSaddle = Collections.min(columnSaddleList);
        }

        if(tempSaddle == newRowSaddle && tempSaddle == newColumnSaddle){
            saddlePtStatus = true;
        }

        return saddlePtStatus;
    }

    public static void main(String[] args) {
        List<List<Integer>> temp = Arrays.asList(Arrays.asList(4,5,4),Arrays.asList(3,5,5),Arrays.asList(1,5,4));
        Matrix m = new Matrix(temp);
        m.getSaddlePoints();
    }
}


class MatrixCoordinate implements Comparable<MatrixCoordinate> {
    private final int row;
    private final int col;

    MatrixCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }

    // Generated equals and hashcode.

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final MatrixCoordinate that = (MatrixCoordinate) o;

        return row == that.row && col == that.col;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }

    @Override
    public int compareTo(MatrixCoordinate o) {
        int rowComparison = Integer.compare(row, o.row);
        return (rowComparison == 0) ? Integer.compare(col, o.col) : rowComparison;
    }
}