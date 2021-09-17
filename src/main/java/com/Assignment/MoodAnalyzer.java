package com.Assignment;

public class MoodAnalyzer {

    public static String message = "";

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public static String analyseMood(){
        try {
            if (message.contains("any") || message.contains("ANY") || message.contains("Any")) {
                return "HAPPY";
            }
            else if (message.contains("SAD") || message.contains("Sad") || message.contains("sad")) {
                return "SAD";
            } else
                return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}
