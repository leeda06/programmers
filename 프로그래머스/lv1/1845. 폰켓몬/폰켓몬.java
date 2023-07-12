import java.util.HashSet;

class Solution {
    public int solution(int[] nums) {
        int maxNums = nums.length / 2; // 선택할 수 있는 폰켓몬의 최대 수
        HashSet<Integer> set = new HashSet<>();

        // 중복을 제거한 폰켓몬의 종류를 저장
        for (int num : nums) {
            set.add(num);
        }

        // 선택할 수 있는 폰켓몬의 최대 수와 중복을 제거한 폰켓몬 종류의 수 중 작은 값을 반환
        return Math.min(maxNums, set.size());
    }
}
