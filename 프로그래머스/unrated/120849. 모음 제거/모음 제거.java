class Solution {
    public String solution(String my_string) {
        String answer = "";
        char my_S[] = my_string.toCharArray();
        for (int i = 0; i < my_string.length(); i++){
            if(my_S[i] != 'a' && my_S[i] != 'e' && my_S[i] != 'i' &&
               my_S[i] != 'u' && my_S[i] != 'o'){
                answer += my_S[i];
            }
        }
        return answer;
    }
}