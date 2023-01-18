package Exercism;

class Triangle {
    boolean isValidTriangle = false;
    double side_1,side_2,side_3=0;
    Triangle(double side1, double side2, double side3) throws TriangleException {
        this.side_1 = side1;
        this.side_2 = side2;
        this.side_3 = side3;
        if(side_1>0 && side_2>0 && side3>0){
            if(side_1+side_2>=side_3 && side_2+side_3>=side_1 && side_1+side_3>=side_2){
                isValidTriangle = true;
             }else{
                throw new TriangleException();
             }
         }else{
         throw new TriangleException();
        }
        
    }

    boolean isEquilateral() {
        boolean isEquilateralEligible = false;
      if(isValidTriangle){
            if(side_1==side_2 && side_2==side_3){
                isEquilateralEligible= true;
            }
        }
        return isEquilateralEligible;
    }

    boolean isIsosceles() {
        boolean isIsoscelesEligible = false;
        if(isValidTriangle){
            if(!isEquilateral()){
                if(side_1==side_2|| side_2==side_3|| side_3==side_1){
                    isIsoscelesEligible= true;
                }
            }
        }
        return isIsoscelesEligible;
    }

    boolean isScalene() {
        boolean isScaleneEligible = false;
        if(!isEquilateral() && !isIsosceles()){
            isScaleneEligible= true;
        }

        return isScaleneEligible;
    }

public static void main(String[] args) throws TriangleException {
    Triangle t = new Triangle(1,3,1);
    System.out.println(t.isScalene());
    
    
}

}

class TriangleException extends Exception {

  
}

