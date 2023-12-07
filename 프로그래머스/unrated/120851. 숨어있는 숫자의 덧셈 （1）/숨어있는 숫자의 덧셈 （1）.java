class Solution {
    public int solution(String my_string) {
        int answer = 0;
        char list[] = my_string.toCharArray();
        
        for(int i = 0; i < list.length; i++){
            if(list[i] > '0' && list[i] <= '9'){
                answer += Character.getNumericValue(list[i]);
            }
        }
        
        return answer;
    }
}