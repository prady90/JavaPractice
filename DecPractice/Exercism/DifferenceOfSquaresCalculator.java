package Exercism;

class DifferenceOfSquaresCalculator {
    int squareOfSums = 0;
    int sumOfSquares = 0;
    
    int computeSquareOfSumTo(int input) {
        for(int i=1; i<=input; i++){
            squareOfSums+=i;
        }
        return  squareOfSums =  (int) Math.pow(squareOfSums,2);
    }

    int computeSumOfSquaresTo(int input) {
        for( int i=1; i<=input; i++){
            sumOfSquares+=(int)Math.pow(i,2);
        }
        return sumOfSquares;
    }

    int computeDifferenceOfSquares(int input) {
       return computeSquareOfSumTo(input)- computeSumOfSquaresTo(input);
    }

}
