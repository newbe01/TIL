package solved.PROGRAMMERS.LV1;

/*
 * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환하는 함수, solution을 완성해 보세요. 
 * 배열의 맨 앞에 최대공약수, 그다음 최소공배수를 넣어 반환하면 됩니다. 
 * 예를 들어 두 수 3, 12의 최대공약수는 3, 최소공배수는 12이므로 solution(3, 12)는 [3, 12]를 반환해야 합니다.
 * 제한 사항
 * 두 수는 1이상 1000000이하의 자연수입니다.
 */
public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        int max = Math.max(n, m);
        int min = Math.min(n, m);



        //최대공약수 
        for(int i = 1; i <= max; i++){ // 1부터 하나씩나누어 최대 공약수를 구하기
            if(min % i == 0 && max % i == 0){
                answer[0] = i;
            }
        }

        //최소공배수
        //최소공배수는 (a*b) / c  c는 최대공약수
        answer[1] = (m * n) / answer[0];

        return answer;
    }
}
