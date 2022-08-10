package com.kevin;

import java.util.ArrayList;
import java.util.List;

public class EngineerFirm extends Utilities implements Company {
    int[] income;

    public EngineerFirm(int n) {
        income = new int[n];
        for(int i=0; i<income.length; i++) {
            income[i] = 0;
        }
    }

    @Override
    public void assignSalaries(int[] salaries) {
        assignValues(this.income, salaries);
        System.out.println("Incomes of engineers credited");
    }

    @Override
    public void averageSalary() {
        double average = calcAverage(this.income);
        System.out.println("Average salary of engineers is " + average);
    }

    @Override
    public void maxSalary() {
        int max = findMax(this.income);
        System.out.println("Maximum salary amongst engineers is " + max);
    }

    @Override
    public void minSalary() {
        int min = findMin(this.income);
        System.out.println("Minimum salary amongst engineers is " + min);
    }
}
