class Solution {
    public int solution(int a, int b) {
        
        String a1 = "" + a + b;
        String a2 = "" + a + b;
        
        String answer = Integer.parseInt(a1) > Integer.parseInt(a2) ? a1 : a2;
        
        return 2 * a * b > Integer.parseInt(answer) ? 2 * a * b : Integer.parseInt(answer);

    }
}