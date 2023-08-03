class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean jadenCaseNext = true;

        for (int i = 0; i < s.length(); i++) {
            char jadenCase = s.charAt(i);

            if (jadenCaseNext && Character.isLetter(jadenCase)) {
                answer.append(Character.toUpperCase(jadenCase));
                jadenCaseNext = false;
            } else {
                answer.append(Character.toLowerCase(jadenCase));
                jadenCaseNext = false;
            }

            if (jadenCase == ' ') {
                jadenCaseNext = true;
            }
        }

        return answer.toString();
    }
}
