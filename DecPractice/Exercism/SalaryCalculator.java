package Exercism;
public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return (daysSkipped>5)? 0.85 :1.00;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return (productsSold>20)? 13 : 10 ;
    }

    public double bonusForProductSold(int productsSold) {
        double bonus = 0;
        bonus = multiplierPerProductsSold(productsSold) * productsSold ;
        return bonus;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int baseSalary  =1000;
        double finalSalary = 0;
        finalSalary = baseSalary * multiplierPerDaysSkipped(daysSkipped) + bonusForProductSold(productsSold);
        return (finalSalary>2000)? 2000 : finalSalary;
    } 
}
