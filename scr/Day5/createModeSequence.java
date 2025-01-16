package Day5;

class createModeSequence {
    public String processCodeByMode(String code) {
        StringBuilder ret = new StringBuilder();
        int mode = 0;

        for (int idx = 0; idx < code.length(); idx++) {
            if (code.charAt(idx) == '1') {
                // mode 전환
                mode = 1 - mode;  // 0->1 또는 1->0으로 전환
            } else {
                // mode가 0일 때는 짝수 인덱스만 추가
                if (mode == 0 && idx % 2 == 0) {
                    ret.append(code.charAt(idx));
                }
                // mode가 1일 때는 홀수 인덱스만 추가
                else if (mode == 1 && idx % 2 == 1) {
                    ret.append(code.charAt(idx));
                }
            }
        }

        // 빈 문자열이면 "EMPTY" 반환
        return ret.length() == 0 ? "EMPTY" : ret.toString();
    }
}