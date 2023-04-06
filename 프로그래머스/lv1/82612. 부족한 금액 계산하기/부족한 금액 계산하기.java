class Solution {
    public long solution(int price, int money, int count) {
        
        long answer = 0;	// 총 이용금액
        
        for(int i=1; i<=count; i++){
            answer += price * i;
        }
        
        return (money - answer) >= 0 ? 0 : (money - answer) * -1;
    }
}