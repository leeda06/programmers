class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int commonDenom = denom1 * denom2;
        numer1 *= denom2;
        numer2 *= denom1;

        int sumNumer = numer1 + numer2;
        
        int find = find(sumNumer, commonDenom);

        answer[0] = sumNumer / find;
        answer[1] = commonDenom / find;

        return answer;
    }

    private int find(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}