class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int day = 0;
        switch(a-1){
            case 11:
                day += 30;
            case 10:
                day += 31;
            case 9:
                day += 30;
            case 8:
                day += 31;
            case 7:
                day += 31;
            case 6:
                day += 30;
            case 5:
                day += 31;
            case 4:
                day += 30;
            case 3:
                day += 31;
            case 2:
                day += 29;                
            case 1:
                day += 31;             
            case 0:
                day += 0;
                break;
        }
        day += b;
        switch(day % 7){
            case 1:
                answer = "FRI";
                break;
            case 2:
                answer = "SAT";
                break;
            case 3:
                answer = "SUN";
                break;
            case 4:
                answer = "MON";
                break;
            case 5:
                answer = "TUE";
                break;
            case 6:
                answer = "WED";
                break;
            case 0:
                answer = "THU";
                break;
        }
        return answer;
    }
}
