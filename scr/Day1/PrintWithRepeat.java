package Day1;

import java.util.Scanner;

public class PrintWithRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        // 제한사항 체크를 더 명확하게 분리
        if (isValidInput(str, n)) {
            System.out.print(str.repeat(n));
        }

        sc.close();
    }

    // 입력값 유효성 검사를 별도 메소드로 분리
    private static boolean isValidInput(String str, int n) {
        return str.length() >= 1 && str.length() <= 10 &&
                n >= 1 && n <= 5;
    }
}
