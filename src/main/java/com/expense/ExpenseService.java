package com.expense;

import java.util.ArrayList;
import java.util.List;

public class ExpenseService {

    private List<Double> expenses = new ArrayList<>();

    // Add expense
    public boolean addExpense(double amount) {
        if (amount <= 0) {
            return false;
        }
        expenses.add(amount);
        return true;
    }

    // Calculate total
    public double getTotalExpense() {
        double total = 0;
        for (double e : expenses) {
            total += e;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("Expense Tracker Running...");
    }
}