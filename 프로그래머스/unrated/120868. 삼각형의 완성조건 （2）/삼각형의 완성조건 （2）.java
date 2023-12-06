class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxNum [] = {0, 1};
        if(sides[0] > sides[1]){
            maxNum[0] = 1;
            maxNum[1] = 0;
        }
        for (int i = 1; i <= sides[0] + sides[1]; i++){
            if(sides[maxNum[0]] < sides[maxNum[1]] + i){
                answer ++;
            }
            if(sides[0] + sides[1] > i){
                answer ++;
            }
        }
        return answer;
    }
}