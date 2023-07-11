import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int[] prevIndex = new int[26];
        Arrays.fill(prevIndex, -1);
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int index = c - 'a';
            
            if (prevIndex[index] == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - prevIndex[index];
            }
            
            prevIndex[index] = i;
        }
        
        return answer;
    }
}
