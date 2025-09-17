// Abid Asif
// September 17,2025
// This code takes in an investment value and annual interest rate and calculates the future value
import java.util.Scanner;
public class C6Peer {

    double annualInterestRate = 0;
    int years = 0;
    double investmentAmount = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investmentAmount = input.nextDouble();
        // gets the annual interest rate and converts it to monthly
        System.out.print("Enter annual interest rate without percentages: ");
        double annualInterestRate = input.nextDouble();
        double monthlyInterestRate = annualInterestRate / 1200;

        // Get how long the investment will last
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        // prints out the final value for each year using a for loop
        for (int i = 1; i <= years; i++) {
            double futureValue = futureInvestmentValue(investmentAmount, monthlyInterestRate, i);
            System.out.printf("Year " + i + " $%.2f\n ", futureValue);
        }
    }


    public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (years * 12));
        return futureInvestmentValue;
}
}