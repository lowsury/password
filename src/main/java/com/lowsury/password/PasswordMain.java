package com.lowsury.password;

import org.apache.commons.text.RandomStringGenerator;

import java.util.Arrays;

public class PasswordMain {

    public static final char[] DEFAULT_CHARS = {
            '0', '2', '3', '4', '5', '6', '7', '8', '9',
            'l', 'x', 'u', 'e', 'x', 'n', 'g', 'v', 'h',
            'L', 'X', 'U', 'E', 'X', 'N', 'G', 'V', 'H',
            'a', 'd', 'm', 'i',
            'A', 'D', 'M',
            '!', '@', '#'};
    public static final int DEFAULT_LENGTH = 12;

    public static void main(String[] args) {
        System.out.println("如果自定义字符串，第一个位置先输入目标长度！");
        StringBuilder sb = new StringBuilder();
        int length = -1;
        if (args != null && args.length > 0) {
            try {
                length = Integer.valueOf(args[0]);
            } catch (Exception e) {
                System.out.println("自定义字符串，第一个位置却不是数字，使用默认字符和长度！");
                new PasswordMain().generatePwd(sb.length() > 0 ? sb.toString().toCharArray() : null, length != -1 ? length : DEFAULT_LENGTH);
                return;
            }
            Arrays.asList(args).forEach((i) -> sb.append(i.trim()));
            new PasswordMain().generatePwd(sb.length() > 0 ? sb.toString().toCharArray() : null, length != -1 ? length : DEFAULT_LENGTH);
            return;
        }
        new PasswordMain().generatePwd(DEFAULT_CHARS, DEFAULT_LENGTH);
    }

    public String generatePwd(char[] args, int length) {
        char[] ch = args != null ? args : DEFAULT_CHARS;
        RandomStringGenerator generator3 = new RandomStringGenerator.Builder().selectFrom(ch).build();
        String generate = generator3.generate(length);
        System.out.println(generate);
        return generate;
    }
}