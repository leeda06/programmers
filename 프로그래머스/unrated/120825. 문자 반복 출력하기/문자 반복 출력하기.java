import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char list [] = my_string.toCharArray();
        for( int i = 0; i < list.length; i++){
            for(int j = 0; j < n; j++){
                answer += Character.toString(list[i]);
            }
        }
        return answer;
    }
}