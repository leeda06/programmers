import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        // 스테이지별 실패율을 저장하는 Map
        Map<Integer, Double> failureRateMap = new HashMap<>();
        
        // 사용자 수를 담는 배열
        int[] users = new int[N + 2]; // 인덱스 1부터 N까지 사용
        
        // 스테이지 별 사용자 수를 계산
        for (int stage : stages) {
            users[stage]++;
        }
        
        // 스테이지 별 실패율 계산 및 저장
        int totalUsers = stages.length; // 총 사용자 수
        for (int i = 1; i <= N; i++) {
            if (totalUsers == 0) {
                failureRateMap.put(i, 0.0); // 스테이지에 도달한 사용자가 없는 경우 실패율은 0
            } else {
                double failureRate = (double) users[i] / totalUsers;
                failureRateMap.put(i, failureRate);
                totalUsers -= users[i];
            }
        }
        
        // 실패율이 높은 순으로 스테이지 번호를 정렬
        List<Integer> sortedStages = new ArrayList<>(failureRateMap.keySet());
        sortedStages.sort((a, b) -> {
            double rateA = failureRateMap.get(a);
            double rateB = failureRateMap.get(b);
            if (rateA == rateB) {
                return a - b; // 실패율이 같다면 작은 번호의 스테이지가 먼저 오도록 정렬
            }
            return Double.compare(rateB, rateA); // 실패율을 내림차순으로 정렬
        });
        
        // 정렬된 스테이지 번호를 배열에 저장
        for (int i = 0; i < N; i++) {
            answer[i] = sortedStages.get(i);
        }
        
        return answer;
    }
}
