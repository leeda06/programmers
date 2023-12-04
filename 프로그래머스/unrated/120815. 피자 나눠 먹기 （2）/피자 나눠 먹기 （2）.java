class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while(true){
            count ++;
            if((n * count % 6 ) == 0){
                break;
            }
        }
        answer = n * count / 6;
        
        return answer;
    }
}