class Solution {
    public int solution(int n) {
        
        int sum = 0;
        
        if(n % 2 == 0){
            for(int i = 0; i <= n / 2; i++)
                sum += 4 * i * i;
        }
        else{
            for(int i = 1; i <= n / 2 + 1; i++)
                sum += 2 * i - 1;
        }
        return sum;
    }
}