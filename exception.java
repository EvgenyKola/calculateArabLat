package com.example;

public class exception extends Exception{
    public exception (String message) {
        throw new Error (message);
    }
}
