package Day3;

public class StringToIntParsingGetMax {
    public int solution(int a, int b) {

        String ab = String.valueOf(a) + String.valueOf(b);
        String ba = String.valueOf(b) + String.valueOf(a);

        int abNum = Integer.parseInt(ab);
        int baNum = Integer.parseInt(ba);

        return Math.max(abNum, baNum);
    }
}
