class Solution {
    public int[] solution(int[] num_list) {
        int num = num_list.length;
        
        int[] answer = new int[num + 1];

        for (int i = 0; i < num + 1; i++) {
            if (i == num ) {
                if (num_list[num - 1] > num_list[num - 2]) {
                    answer[i] = num_list[num - 1] - num_list[num - 2];
                } else {
                    answer[i] = num_list[num - 1] * 2;
                }
            } else {
                answer[i] = num_list[i];
            }
        }

        return answer;
    }
}
