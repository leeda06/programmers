import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int k = commands[i][2] - 1;
            
            List<Integer> subArray = new ArrayList<>();
            for (int j = start; j <= end; j++) {
                subArray.add(array[j]);
            }
            
            Collections.sort(subArray);
            answer[i] = subArray.get(k);
        }
        
        return answer;
    }
}
