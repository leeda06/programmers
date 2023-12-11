class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int numAB = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int numBA = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        
        if(numAB >= numBA){
            answer = numAB;
        }else{
            answer = numBA;
        }
            
        return answer;
    }
}