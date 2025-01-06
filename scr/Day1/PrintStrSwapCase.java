package Day1;

import java.util.Scanner;

public class PrintStrSwapCase {
    private static final int MIN_LENGTH = 1;
    private static final int MAX_LENGTH = 20;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        if (isValidString(str)) {
            System.out.println(swapCase(str));
        }

        sc.close();
    }

    // 입력값 유효성 검사 (알파벳 및 길이 제한)
    private static boolean isValidString(String str) {
        return str != null &&
                str.length() >= MIN_LENGTH &&
                str.length() <= MAX_LENGTH &&
                str.matches("[a-zA-Z]+");
    }

    // 대소문자 변환
    private static String swapCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            chars[i] = Character.isUpperCase(chars[i]) ?
                    Character.toLowerCase(chars[i]) :
                    Character.toUpperCase(chars[i]);
        }
        return new String(chars);
    }
}
