package com.sprint3r.cicd.gradecalculator;

import java.util.Map;
import java.util.LinkedHashMap;

public class GradeCalculator {

    static Map<Integer, String> scoreMap = new LinkedHashMap<Integer, String>();
    static {
        scoreMap.put(95, "A+");
        scoreMap.put(85, "A");
        scoreMap.put(80, "A-");
        scoreMap.put(70, "B");
        scoreMap.put(65, "C");
        scoreMap.put(60, "D+");
        scoreMap.put(55, "D");
        scoreMap.put(50, "D-");
        scoreMap.put(40, "F+");
    }

    public String cal(int score) {
        if (score > 100) {
            return "Invalid score";
        }

        for (Integer scoreLenght : scoreMap.keySet()) {
            if (score >= scoreLenght) {
                return scoreMap.get(scoreLenght);
            }
        }

        return "F";
    }

}
