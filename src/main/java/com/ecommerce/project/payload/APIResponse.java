package com.ecommerce.project.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class APIResponse {
    private String message;
    private boolean success;
    //    private Map<String, String> errors;
//
    public APIResponse(String message, boolean success) {
        this.message = message;
        this.success = success;
    }
//
//    public APIResponse(String message, boolean success, Map<String, String> errors) {
//        this.message = message;
//        this.success = success;
//        this.errors = errors;
//    }
}
