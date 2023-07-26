import java.util.HashSet;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        if (isPossible(cards1, cards2, goal)) {
            return "Yes";
        }
        if (isPossible(cards2, cards1, goal)) {
            return "Yes";
        }
        return "No";
    }

    private boolean isPossible(String[] firstCards, String[] secondCards, String[] goal) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        for (String card : firstCards) {
            set1.add(card);
        }

        int firstSetIdx = 0;
        int secondSetIdx = 0;

        for (String word : goal) {
            if (firstSetIdx < firstCards.length && firstCards[firstSetIdx].equals(word)) {
                firstSetIdx++;
            } else if (secondSetIdx < secondCards.length && secondCards[secondSetIdx].equals(word)) {
                secondSetIdx++;
            } else {
                return false;
            }
        }

        return true;
    }
}
