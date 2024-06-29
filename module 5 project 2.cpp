#include <iostream>
#include <iom

//function prints the calculated balance
void printDetails(int year, double yearEndBalance, double interestEarned) {
    // prints year end balance as well as interest earned
    std::cout << year << "\t\t$" << std::fixed << std::setprecision(2) << yearEndBalance
              << "\t\t$" << std::fixed << std::setprecision(2) << interestEarned << std::endl;
}

double calculateBalanceWithoutMonthlyDeposit(double initialInvestment, double interestRate, int numberOfYears) {
    // converts anual rate into monthly
    double monthlyInterestRate = (interestRate / 100) / 12;
    double balance = initialInvestment;

    for (int year = 1; year <= numberOfYears; ++year) {
        double startingBalanceForYear = balance;
        
        // calculates monthly interest
        for (int month = 1; month <= 12; ++month) {
            balance += balance * monthlyInterestRate;
        }
        
        double interestEarnedThisYear = balance - startingBalanceForYear;

        // prints current year details
        printDetails(year, balance, interestEarnedThisYear);
    }

    return balance;
}

double balanceWithMonthlyDeposit(double initialInvestment, double monthlyDeposit, double interestRate, int numberOfYears) {
    // converts anual rate into monthly for calculations
    double monthlyInterestRate = (interestRate / 100.0) / 12.0;
    double balance = initialInvestment;

    for (int year = 1; year <= numberOfYears; ++year) {
        double startingBalanceForYear = balance;
        double interestEarnedThisYear = 0.0;

        for (int month = 1; month <= 12; ++month) {
            // adds deposit
            balance += monthlyDeposit;
            // calculates monthly interest and updates balance
            balance += balance * monthlyInterestRate;
            interestEarnedThisYear += balance * monthlyInterestRate;
        }

        // prints current year details
        printDetails(year, balance, interestEarnedThisYear);
    }

    return balance;
}

int main() {
    // THIS IS A TEST MAIN, NUMBERS CAN BE SUBSTITUTED OR REPLACED WITH USER INPUTS
    double initialInvestment = 100.0;
    double monthlyDeposit = 10.0;
    double interestRate = 10.0;
    int numberOfYears = 10;

    std::cout << "Without monthly deposit:" << std::endl; // calls to function to print year end balance w/o deposit
    calculateBalanceWithoutMonthlyDeposit(initialInvestment, interestRate, numberOfYears);

    std::cout << std::endl;
    std::cout << "With monthly deposit:" << std::endl; //calls to function to print year end balance w/deposit
    balanceWithMonthlyDeposit(initialInvestment, monthlyDeposit, interestRate, numberOfYears);

    return 0;
}