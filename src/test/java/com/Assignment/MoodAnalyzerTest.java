package com.Assignment;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {
    public MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void mood_happytest() throws MoodAnalysisException {
        String message = "Im in Happy mood....";
        String expectedmessage = "HAPPY";
        String actualmessage = mood.analyseMood(message);
        assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void mood_sadtest() throws MoodAnalysisException {
        String message = "Im in Sad mood....";
        String expectedmessage = "SAD";
        String actualmessage = mood.analyseMood(message);
        assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void mood_nulltest() throws MoodAnalysisException {
        try {
            mood.analyseMood(null);
        } catch (MoodAnalysisException exception) {
            String expectedmessage = "Empty Mood";
            assertEquals(expectedmessage, exception.message);
        }
    }
}
