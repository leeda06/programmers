class Solution {
    public String solution(String my_string, String letter) {
        String answer = ""; 
        char string_[] = my_string.toCharArray();
        for (int i = 0; i < string_.length; i++){
            if(string_[i] == letter.charAt(0)){
                continue;
            }
            answer += string_[i];
        }
        return answer;
    }
}