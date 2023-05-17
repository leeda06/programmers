class Solution {
    public int[] solution(String myString) {
        int count = 1;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                count++;
            }
        }
        
        int[] answer = new int[count];
        int num = 0;
        count = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                answer[count] = num;
                num = 0;
                count++;
            } else {
                num++;
            }
        }
        
        answer[count] = num;
        
        return answer;
    }
}
