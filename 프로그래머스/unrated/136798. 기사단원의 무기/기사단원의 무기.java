class Solution {
    // 개선된 countDivisors 함수
    private int countDivisors(int n) {
        int count = 0;
        int sqrtN = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                count += 2; // 약수 쌍 (i, n/i)를 더합니다.
            }
        }
        // 제곱근이 정수일 경우 중복으로 더해진 약수를 한 개 빼줍니다.
        if (sqrtN * sqrtN == n) {
            count--;
        }
        return count;
    }

    public int solution(int n, int limit, int power) {
        int totalWeight = 0;
        for (int i = 1; i <= n; i++) {
            int divisors = countDivisors(i);
            int attackPower = (divisors <= limit) ? divisors : power;
            totalWeight += attackPower;
        }
        return totalWeight;
    }
}
