package com.example.Data.Retrieval.CarbonCell.Assignment.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponse {
    private int count;
    private DataEntries[] entries;
}
