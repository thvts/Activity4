package com.example.myapplication;

public class BigBank {
    private double loan_amount, interest, interestRate;

    public BigBank(){
        interestRate = 0.05;
        interest = 0.0;
        loan_amount = 0.0;
    }

    public BigBank(double loan, double interest){
        this.loan_amount = loan;
        this. interest = interest;
    }

    public void computeInt(){
        double compute = 1 + (interest/12);
        double comp2 = Math.pow(compute, 2);
        interest = loan_amount * (comp2-1);
    }

    public double returnRate(){
        return interest;
    }
}
