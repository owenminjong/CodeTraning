package Day2;

import java.util.Scanner;

public class ToCharArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for(char c : a.toCharArray()){
            System.out.println(c);
        }
    }
}
