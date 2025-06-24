package com.group1.Enterprise.Expenses.Management.System.dto;

import com.group1.Enterprise.Expenses.Management.System.entity.Expense;
import com.group1.Enterprise.Expenses.Management.System.entity.Income;
import lombok.Data;

import java.util.List;

@Data
public class GraphDTO {

    private List<Expense> expenseList;

    private List<Income> incomeList;
}
