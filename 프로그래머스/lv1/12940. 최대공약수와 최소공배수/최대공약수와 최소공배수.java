class Solution {
    public int[] solution(int n, int m) {
        
        int[] answer = new int[2];
        int max, min;
        
        if(m >= n){
            max = m;
            min = n;
        }else{
            max = n;
            min = m;
        }
        
        //최대공약수
        for(int i = 1; i <= min; i++){
            if(max % i == 0 && min % i == 0) answer[0] = i;
        }
        
        answer[1] = (max * min) / answer[0];
        
        return answer;
    }
}