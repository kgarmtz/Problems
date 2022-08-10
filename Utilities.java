package com.kevin;

public class Utilities {
    public void assignValues(int[] income, int[] salaries ) {
        if( salaries.length >= income.length ) {
            for( int i = 0; i< income.length; i++ ) {
                income[i] = salaries[i];
            }
        } else {
            for( int i = 0; i < salaries.length; i++ ){
                income[i] = salaries[i];
            }
        }
    }

    public double calcAverage(int[] income) {
        double sum = 0.0;
        for (int i=0; i < income.length; i++){
            sum += income[i];
        }

        return sum / income.length;
    }

    public int findMax(int[] income) {
        int max = income[0];

        for(int i=1; i<income.length; i++) {
            max = Math.max( max,  income[i]);
        }

        return max;
    }

    public int findMin(int[] income) {
        int min = income[0];

        for(int i=1; i<income.length; i++) {
            min = Math.min( min,  income[i]);
        }

        return min;
    }
}
