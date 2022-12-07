package com.moodanalyser;

public class MoodAnalyser {

    public String analyzeMood(String message) {
        //UC2-HANDLE EXCEPTION IF USER PROVIDE INVALID MOOD LIKE NULL
        try{
            String mood=null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        if (message.contains("Sad"))
            return null;
        else
            return "Happy";
    }
}



