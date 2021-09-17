package com.Assignment;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest {
    public MoodAnalyzer mood = new MoodAnalyzer();

    @Test
    public void moodhappytest() {
        String expectedmessage = "HAPPY";
        String actualmessage = mood.analyseMood();
        Assert.assertEquals(expectedmessage, actualmessage);
    }

    @Test
    public void moodsadtest(){
        String expectedmessage = "SAD";
        String actualmessage = mood.analyseMood();
        Assert.assertEquals(expectedmessage, actualmessage);
    }
}
