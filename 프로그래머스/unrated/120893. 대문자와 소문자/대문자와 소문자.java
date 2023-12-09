class Solution {
    public String solution(String my_string) {
        String answer = "";
        char list [] = my_string.toCharArray();
        
        for(int i = 0; i<list.length; i++){
            if((int)list[i] <= 90){
                answer += Character.toString(list[i]).toLowerCase();
            }else if((int)list[i] > 90){
                answer += Character.toString(list[i]).toUpperCase();
            }
        }
        return answer;
    }
}