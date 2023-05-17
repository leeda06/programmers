import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int numN = n;
        int length = (int)(Math.log10(n));
        int maxI = (int)Math.pow(10, length);

        for(int i = 1; i <=  maxI; i *= 10){
            answer += numN % 10;
            numN /= 10;
        }

        return answer;
    }
}