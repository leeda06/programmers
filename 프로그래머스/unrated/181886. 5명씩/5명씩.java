class Solution {
    public String[] solution(String[] names) {
        String[] answer = new String[(int) Math.ceil((double) names.length / 5)];

        int count = 0;

        for (int i = 0; i < names.length; i += 5) {
            StringBuilder group = new StringBuilder();

            group.append(names[i]).append(" ");
            
            answer[count] = group.toString().trim();
            count++;
        }

        return answer;
    }
}
