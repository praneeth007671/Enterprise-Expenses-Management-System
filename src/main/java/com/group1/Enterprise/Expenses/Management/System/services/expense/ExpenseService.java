package com.group1.Enterprise.Expenses.Management.System.services.expense;

import com.group1.Enterprise.Expenses.Management.System.dto.ExpenseDTO;
import com.group1.Enterprise.Expenses.Management.System.entity.Expense;

import java.util.List;

public interface ExpenseService {
    Expense postExpense(ExpenseDTO expenseDTO);

    List<Expense> getAllExpenses();

    Expense getExpenseById(Long id);

    Expense updateExpense(Long id, ExpenseDTO expenseDTO);

    void deleteExpense(Long id);

}
