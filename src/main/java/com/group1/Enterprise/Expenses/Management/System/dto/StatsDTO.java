package com.group1.Enterprise.Expenses.Management.System.dto;

import com.group1.Enterprise.Expenses.Management.System.entity.Expense;
import com.group1.Enterprise.Expenses.Management.System.entity.Income;
import lombok.Data;

@Data
public class StatsDTO {

    private Double income;

    private Double expense;

    private Income latestIncome;

    private Expense latestExpense;

    private Double balance;

    private Double minIncome;

    private Double maxIncome;

    private Double minExpense;

    private Double maxExpense;


}
