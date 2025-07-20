import java.util.HashMap;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int answer = -1;

        for (int num : array) {
            int count = countMap.getOrDefault(num, 0) + 1;
            countMap.put(num, count);
            if (count > maxCount) {
                maxCount = count;
                answer = num;
            }
        }

        int freq = 0;
        for (int val : countMap.values()) {
            if (val == maxCount) freq++;
            if (freq > 1) return -1;
        }

        return answer;
    }
}