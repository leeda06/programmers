class Solution {
    public int solution(int n) {
        int answer = 0;
        String list_s = Integer.toString(n);
        char list_c [] = list_s.toCharArray();
        for(int i = 0; i < list_c.length; i++){
            answer += (int)list_c[i] - '0';
        }
        return answer;
    }
}