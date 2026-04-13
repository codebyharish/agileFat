package com.expense;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ExpenseServiceTest {

    @Test
    void validExpenseTest() {
        ExpenseService service = new ExpenseService();
        assertTrue(service.addExpense(500));
    }

    @Test
    void invalidExpenseTest() {
        ExpenseService service = new ExpenseService();
        assertFalse(service.addExpense(-100));
    }

    @Test
    void totalCalculationTest() {
        ExpenseService service = new ExpenseService();
        service.addExpense(100);
        service.addExpense(200);
        assertEquals(300, service.getTotalExpense());
    }

    @Test
    void emptyTotalTest() {
        ExpenseService service = new ExpenseService();
        assertEquals(0, service.getTotalExpense());
    }
}