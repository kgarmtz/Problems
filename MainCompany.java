package com.kevin;

public class MainCompany {
    public static void main(String[] args) {
        EngineerFirm ef = new EngineerFirm(5);
        AccountantFirm af = new AccountantFirm(5);

        int[] efSalaries = { 6848, 9329, 9984, 5543, 7986 };
        int[] afSalaries = { 9317, 7796, 3352, 7068, 9500 };

        // JRE - JDK

        ef.assignSalaries(efSalaries);
        af.assignSalaries(afSalaries);

        // Calculations based on engineers
        ef.averageSalary();
        ef.maxSalary();
        ef.minSalary();

        // Calculations based on accountants
        af.averageSalary();
        af.maxSalary();
        af.minSalary();
    }
}
