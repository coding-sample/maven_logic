package com.example.service;

import com.example.StringUtil;

/**
 * Logicクラスは、文字列の処理を行うユーティリティクラスです。
 */
public class Logic {
    private StringUtil stringUtil;

    /**
     * Logicクラスのコンストラクタ。
     * StringUtilのインスタンスを初期化します。
     */
    public Logic() {
        this.stringUtil = new StringUtil();
    }

    /**
     * 入力文字列を処理し、特定のフォーマットで返します。
     * 文字は大文字に変換され、数字は1増加されます。
     * 
     * @param input 処理する入力文字列
     * @return 処理された文字列
     */
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
}
