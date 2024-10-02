package com.example.Employee.Exception;

import java.io.Serial;

public class DataNotFoundException extends RuntimeException{
    @Serial
    private static final long serialVersionUID = 1L;


    public DataNotFoundException(String message) {
        super(message);
    }
}
