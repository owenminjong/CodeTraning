package Day3;

public class GetBiggerWithMultiply {
    public int solution(int a, int b) {
        String ab = String.valueOf(a) + String.valueOf(b);
        int abNum = Integer.parseInt(ab);

        int multiply = 2 * a * b;

        return Math.max(abNum, multiply);
    }
}
