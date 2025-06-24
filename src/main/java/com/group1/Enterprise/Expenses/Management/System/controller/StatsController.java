package com.group1.Enterprise.Expenses.Management.System.controller;

import com.group1.Enterprise.Expenses.Management.System.dto.GraphDTO;
import com.group1.Enterprise.Expenses.Management.System.services.stats.StatsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/stats")
@RequiredArgsConstructor
@CrossOrigin("*")
public class StatsController {

    private final StatsService statsService;

    @GetMapping("/chart")

    public ResponseEntity<GraphDTO> getCharDetails(){
        return ResponseEntity.ok(statsService.getCharData());
    }
    @GetMapping
    public ResponseEntity<?> getStats(){
        return ResponseEntity.ok(statsService.getStats());
    }
}
