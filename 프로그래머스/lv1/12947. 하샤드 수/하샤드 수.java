class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int numX = x;
        int num = 0;
        int length = (int)(Math.log10(x));
        int maxI = (int)Math.pow(10, length);
        
        for(int i = 1; i <= (1 * maxI); i *= 10){
            num += numX % 10;
            numX /= 10;
        }
        
        if((x % num) != 0){
            answer = false;
        }
        return answer;
    }
}