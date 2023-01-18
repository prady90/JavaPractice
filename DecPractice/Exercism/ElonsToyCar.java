package Exercism;
public class ElonsToyCar {

    int distance = 0;
    int percentage = 100;

    public static ElonsToyCar buy() {
        // throw new UnsupportedOperationException("Please implement the (static)
        // RemoteControlCar.buy() method");
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        // return ("Driven "+distance+" meters");
        return String.format("Driven %d meters", distance);
    }

    public String batteryDisplay() {

        return (percentage > 0) ? String.format("Battery at %d%%", percentage) : "Battery empty";

        // Approach 2
        // return (percentage>0)?("Battery at "+percentage+"%"):"Battery empty";

        // Approach 3
        /*
         * if(percentage>0){
         * return ("Battery at "+percentage+"%");
         * }else{
         * return ("Battery empty");
         * }
         */

    }

    public void drive() {
        // throw new UnsupportedOperationException("Please implement the (static)
        // RemoteControlCar.drive() method");
        if (percentage != 0) {
            distance = distance + 20;
            percentage = percentage - 1;
        }

    }

}