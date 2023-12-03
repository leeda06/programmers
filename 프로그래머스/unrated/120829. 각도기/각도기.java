class Solution {
    public int solution(int angle) {
        int answer = 0;
        if(180 == angle){
            answer = 4;
        }else if(angle > 90){
            answer = 3;
        }else if (90 == angle){
            answer = 2;
        }else if(angle > 0){
            answer = 1;
        }
        return answer;
    }
}