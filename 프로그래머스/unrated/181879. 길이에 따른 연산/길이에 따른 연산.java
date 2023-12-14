class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int mult = 1;
        
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
        }
        
        for (int i = 0; i < num_list.length; i++) {
            mult *= num_list[i];
        }
        
        if(num_list.length > 10){
            answer = sum;
        }else{
            answer = mult;
        }
        return answer;
    }
}