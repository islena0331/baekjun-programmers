class Solution {
    public int solution(int n) {
        int i = 1;
        int answer = 0;
        
        while(true){ 
        if((6 * i)%n == 0){ 
            answer = i;
            break;
        }
        else
            i++;
        }
        
        return answer;
    }
}