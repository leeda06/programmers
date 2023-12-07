import java.util.ArrayList;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new <Integer>ArrayList();
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
             answer.add(i);   
            }
        }
        
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}