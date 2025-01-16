package Day5;

public class DiceScoreCalculator {
    public int calculateScore(int a, int b, int c) {
        int sum = a + b + c;                   // 1차항 합
        int squareSum = a*a + b*b + c*c;       // 2차항 합
        int cubeSum = a*a*a + b*b*b + c*c*c;   // 3차항 합

        // 세 숫자가 모두 같은 경우 (a == b == c)
        if(a == b && b == c) {
            return sum * squareSum * cubeSum;
        }
        // 두 숫자만 같은 경우 (a == b != c 또는 b == c != a 또는 a == c != b)
        else if(a == b || b == c || a == c) {
            return sum * squareSum;
        }
        // 세 숫자가 모두 다른 경우
        else {
            return sum;
        }
    }
}
