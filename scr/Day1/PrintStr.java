package Day1;

import java.util.Scanner;

public class PrintStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();        // 입력받은 문자열
        int Aleng = a.length();      // 문자열의 길이

        // 제한사항 체크 (1 ≤ str의 길이 ≤ 1,000,000)
        if (Aleng >= 1 && Aleng <= 1000000) {
            System.out.println(a);    // 입력받은 문자열 그대로 출력
        }

        sc.close();
    }
}