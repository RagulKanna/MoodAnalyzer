package com.Assignment;

public class MoodAnalyzer {


    public static String analyseMood(String mood) throws MoodAnalysisException {
        try {
            if (mood.contains("any") || mood.contains("ANY") || mood.contains("Any") || mood.contains("happy") || mood.contains("HAPPY") || mood.contains("Happy")) {
                return "HAPPY";
            } else if (mood.contains("SAD") || mood.contains("Sad") || mood.contains("sad")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException exception) {
            throw new MoodAnalysisException("Empty Mood");
        }

    }
}
