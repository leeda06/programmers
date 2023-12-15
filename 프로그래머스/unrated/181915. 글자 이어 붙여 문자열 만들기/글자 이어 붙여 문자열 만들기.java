class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        char [] c_string = my_string.toCharArray();
        for(int i = 0; i < index_list.length; i++){
            answer += c_string[index_list[i]];
        }
        return answer;
    }
}