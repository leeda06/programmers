class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char [] list = myString.toCharArray();
        
        for(int i = 0; i < list.length; i++){
            if(list[i] == 'A'){
                list[i] = 'B';
            }else if(list[i] == 'B'){
                list[i] = 'A';                
            }
        }
        
        myString = String.valueOf(list);
        
        if(myString.contains(pat)){
            answer = 1;
        }
        
        return answer;
    }
}