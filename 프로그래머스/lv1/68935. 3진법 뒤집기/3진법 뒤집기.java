class Solution {
    public int solution(int n) {
        int answer = 0;
        //숫자를 3진법으로 변환
        String str = Integer.toString(n, 3);
        String reversed = new StringBuilder(str).reverse().toString();
        answer = Integer.valueOf(reversed, 3);
		return answer;
    }
}