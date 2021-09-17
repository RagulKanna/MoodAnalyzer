package com.Assignment;

public class MoodAnalyzer {

    public static String message = "Im in SAD mood";

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public static String analyseMood() {
        if (message.contains("any") || message.contains("ANY") || message.contains("Any")) {
            return "HAPPY";
        }
        if (message.contains("SAD") || message.contains("Sad") || message.contains("sad")) {
            return "SAD";
        } else
            return null;
    }
}
