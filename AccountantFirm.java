package com.kevin;

public class AccountantFirm extends Utilities implements Company {
    int[] income;

    public AccountantFirm(int n) {
        income = new int[n];
        for(int i=0; i<income.length; i++) {
            income[i] = 0;
        }
    }

    @Override
    public void assignSalaries(int[] salaries) {
        assignValues(this.income, salaries);
        System.out.println("Incomes of accountants credited");
    }

    @Override
    public void averageSalary() {
        double average = calcAverage(this.income);
        System.out.println("Average salary of accountants is " + average);
    }

    @Override
    public void maxSalary() {
        int max = findMax(this.income);
        System.out.println("Maximum salary amongst accountants is " + max);
    }

    @Override
    public void minSalary() {
        int min = findMin(this.income);
        System.out.println("Minimum salary amongst accountants is " + min);
    }
}
