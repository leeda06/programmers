class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int numP = 0;
        int numY = 0;
        for(int i = 0; i < s.length(); i++){
            char c = Character.toLowerCase(s.charAt(i));
            if(c == 'p'){
                numP++;
            } else if(c == 'y'){
                numY++;
            }
        }
        if(numP != numY){
            answer = false;  
        }
        
        return answer;
    }
}