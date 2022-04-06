package lessons.lesson5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab5 {
    public static int task1(String string) {
        int max = 0;
        int len = 0;
        int lenString = string.length();
        for (int i = 0; i < lenString; i++) {
            if (!Character.isLetter(string.charAt(i))) {
                if ( max < len) {
                    max = len;
                }
                    len = 0;
            } else {
                len++;
                if (i == lenString - 1 && max < len) {
                    max = len;
                    len = 0;
                }
            }

        }
        return max;
    }

    public static boolean task2(String string) {
        String stringLow = string.toLowerCase();
        return (stringLow.equals(new StringBuilder(stringLow).reverse().toString()));
    }

    public static String task3(String string) {
        String stringLow = string.toLowerCase();
        return (stringLow.replaceAll("бяка", "[вырезано цензурой]"));
    }

    public static int task4(String string, String subString) {
        Pattern p = Pattern.compile(subString);
        Matcher m = p.matcher(string);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }

    public static void task5(String string) {
        System.out.println("The given string is: " + string);
        String[] stringArr = string.split(" ");
        StringBuilder stringRev = new StringBuilder();
        for (String word : stringArr) {
            stringRev.append(new StringBuilder(word).reverse())
                    .append(" ");
        }
        System.out.println("The string reversed word by word is: " + stringRev);
    }

}
