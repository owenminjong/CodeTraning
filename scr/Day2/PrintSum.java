package Day2;

import java.util.Scanner;

public class PrintSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(1<=a && b <= 100){
            System.out.printf("%d + %d = %d", a, b, a+b);
        }
    }
}
