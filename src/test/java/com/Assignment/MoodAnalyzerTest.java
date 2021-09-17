package com.Assignment;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    public MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void moodhappytest() {
        String message = "Im in any mood...";
        String expectedmessage = "happy";
        String actualmessage = mood.analysehappyMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void moodsadtest() {
        String message = "Im in sad mood...";
        String expectedmessage = "sad";
        String actualmessage = mood.analysesadMood(message);
        Assert.assertEquals(expectedmessage, actualmessage);
    }
}
