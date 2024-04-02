package com.example.Data.Retrieval.CarbonCell.Assignment.service;

import com.example.Data.Retrieval.CarbonCell.Assignment.model.ApiResponse;
import com.example.Data.Retrieval.CarbonCell.Assignment.model.DataEntries;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Service
public class DataRetrievalService {

    private static final String API_URL = "https://api.publicapis.org/entries";

    public DataEntries[] fetchApiEntries(String category, Integer limit) {
        String url = API_URL;
        if (category != null || limit != null) {
            url += "?";
            if (category != null) {
                url += "category=" + category;
            }
            if (category != null && limit != null) {
                url += "&";
            }
            if (limit != null) {
                url += "limit=" + limit;
            }
        }

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);
        String responseBody = response.getBody();
        //System.out.println("JSON response: " + responseBody);

        // Deserialize the response into an array of DataEntries
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ApiResponse apiResponse = objectMapper.readValue(responseBody, ApiResponse.class);
            return apiResponse.getEntries();
        } catch (JsonProcessingException e) {
            e.printStackTrace();

            return null;
        }
    }
}
