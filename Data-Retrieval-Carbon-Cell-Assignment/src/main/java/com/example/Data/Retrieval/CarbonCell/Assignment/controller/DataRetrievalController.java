package com.example.Data.Retrieval.CarbonCell.Assignment.controller;

import com.example.Data.Retrieval.CarbonCell.Assignment.model.DataEntries;
import com.example.Data.Retrieval.CarbonCell.Assignment.service.DataRetrievalService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DataRetrievalController {

    @Autowired
    DataRetrievalService dataRetrievalService;

    @GetMapping("/fetchApi")
    public DataEntries[] getApiEntries(
            @RequestParam(required = false) String category,
            @RequestParam(required = false) Integer limit) {
        return dataRetrievalService.fetchApiEntries(category, limit);
    }
    @GetMapping("/demo")
    public ResponseEntity<String> demo() {
        return ResponseEntity.ok("Hello from secured url");
    }

}
