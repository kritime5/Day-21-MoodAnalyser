package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad(){
       MoodAnalyser moodAnalyser= new MoodAnalyser();
      String mood= moodAnalyser.analyzeMood("This is a sad message");

        Assert.assertEquals("SAD",mood);

    }
    public void givenMessage_WhenNodSad_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String mood=moodAnalyser.analyzeMood("This is happy message");
        Assert.assertEquals("HAPPY",mood);
    }





}