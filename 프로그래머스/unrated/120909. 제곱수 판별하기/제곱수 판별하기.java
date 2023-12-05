class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        while (true){
            if(count * count == n){
                answer = 1;
                break;
            }else if(count * count > n){
                answer = 2;
                break;
            }
            count++;
        }
        return answer;
    }
}