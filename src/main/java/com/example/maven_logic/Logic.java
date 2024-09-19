package com.example.maven_logic;

import com.example.maven_common.StringUtil;

public class Logic {
    private StringUtil stringUtil;

    public Logic() {
        this.stringUtil = new StringUtil();
    }

    public String processData(String input) {
        if (input == null || input.isEmpty()) {
            return "No input provided";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
            } else if (Character.isDigit(c)) {
                result.append((char)(c + 1));
            } else {
                result.append(c);
            }
        }
        
        // Use StringUtil's method
        result.append(" - ").append(stringUtil.getRepo());
        
        return result.toString();
    }

    public int calculateSum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
