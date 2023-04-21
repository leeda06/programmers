class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int num = 0;
        while(true){
            
            if(n < a){
                break;
            }
            
            answer +=(n / a) *b;
            num = n % a;
            n = (n / a) * b + num;
        }
        return answer;
    }
}