package com.Assignment;

public class MoodAnalysisException extends Exception {
    public String message;

    public MoodAnalysisException(String message) {
        this.message = message;
    }
}
