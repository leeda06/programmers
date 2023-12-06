import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = sides[0] * 2 -1;
        
        return answer;
    }
}