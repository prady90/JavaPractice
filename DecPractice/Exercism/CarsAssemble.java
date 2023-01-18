package Exercism;

public class CarsAssemble {

    public double productionRatePerHour(int speed) {
       // throw new UnsupportedOperationException("Please implement the CarsAssemble.productionRateperHour() method");
        
        double successRateValue = successRate(speed);
        return (speed * 221 * successRateValue);
    }

    public int workingItemsPerMinute(int speed) {
        //throw new UnsupportedOperationException("Please implement the CarsAssemble.workingItemsPerMinute() method");
       double successRateValue = successRate(speed);
       int result = (int)((speed * 221 * successRateValue)/60);
        return result;
        
    }

    public double successRate ( int speed){
        double successRate = 0;
        switch(speed){
            case 1 : case 2:  case 3: case 4: successRate = 1; break;
            case 5 : case 6:  case 7: case 8: successRate = 0.9; break;
            case 9 : successRate = 0.8; break;
            case 10:  successRate = 0.77; break;
            default: successRate = 0; break;    
        }
        return successRate;
    }
}
