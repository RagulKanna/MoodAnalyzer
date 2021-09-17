package com.Assignment;

public class MoodAnalyzer {

    public static String analysehappyMood(String message) {
        if (message.contains("any") || message.contains("ANY")) {
            return "happy";
        } else
            return "sad";
    }
    public static String analysesadMood(String message) {
        if (message.contains("sad") || message.contains("SAD")) {
            return "sad";
        } else
            return "happy";
    }
}
