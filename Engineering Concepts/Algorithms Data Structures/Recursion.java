//Superset Id: 6385480
import java.util.Scanner;

class Recursion {
    public static double futureValue(double presentVal, double rate, int years) {
        if (years == 0)
            return presentVal;
        return (1 + rate) * futureValue(presentVal, rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter present value of the property:");
        double presentValue = Double.parseDouble(s.nextLine().trim());// 22000
        System.out.println("Enter annual growth rate of the property:(in decimal)");
        double annualGrowthRate = Double.parseDouble(s.nextLine().trim());// 0.1
        System.out.println("Enter number of years after which the value of the property to be predicted:");
        int years = Integer.parseInt(s.nextLine().trim());// 15
        double future = futureValue(presentValue, annualGrowthRate, years);// 91899.46
        System.out.printf("Predicted value after %d years = %.2f\n", years, future);
    }
}
