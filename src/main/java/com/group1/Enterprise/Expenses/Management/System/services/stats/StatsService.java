package com.group1.Enterprise.Expenses.Management.System.services.stats;

import com.group1.Enterprise.Expenses.Management.System.dto.GraphDTO;
import com.group1.Enterprise.Expenses.Management.System.dto.StatsDTO;

public interface StatsService {

    GraphDTO getCharData();

    StatsDTO getStats();
}
