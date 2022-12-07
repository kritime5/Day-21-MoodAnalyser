package com.moodanalyser;

public class MoodAnalyser {

    public String analyzeMood(String message) {
        if(message.contains("Sad"))
        return null;
        else
            return "Happy";
    }
}
