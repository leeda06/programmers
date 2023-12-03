class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        int count = numbers.length;
        for (int i = 0; i < count; i++){
            answer += numbers[i];
        }
        return answer / count;
    }
}