class Solution {
    public String solution(String rsp) {
        String answer = "";
        
        char rsp_char [] = rsp.toCharArray();
        
        for(int i = 0; i < rsp_char.length; i++){
            if(rsp_char[i] == '2'){
                answer += '0';
                
            }else if(rsp_char[i] == '0'){
                answer += '5';
               
            } else if(rsp_char[i] == '5'){
                answer += '2';
               
            } 
        }
        
        return answer;
    }
}