package com.group1.Enterprise.Expenses.Management.System.services.income;

import com.group1.Enterprise.Expenses.Management.System.dto.IncomeDTO;
import com.group1.Enterprise.Expenses.Management.System.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);


    List<IncomeDTO> getAllIncomes();

    Income updateIncome( Long id, IncomeDTO incomeDTO);

    IncomeDTO getIncomeById(Long id);

    void deleteIncome(Long id);
}
