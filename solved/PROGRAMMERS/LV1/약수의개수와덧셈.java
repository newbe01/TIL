package solved.PROGRAMMERS.LV1;


/*
 * 두 정수 left와 right가 매개변수로 주어집니다. 
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고, 
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 */
public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;

        int cnt = 0 ;
        for(int i = left; i <= right ; i++){ // left 부터 right 까지 
            cnt = 0 ;
            for(int j = 1 ; j <= i ; j++){  //인덱스값의 약수갯수구하기
                if(i % j == 0){
                    cnt++;
                }
            }
            if(cnt % 2 == 0){ //갯수가 짝수면 더하고 홀수면 빼기
                answer += i;
            }else{
                answer -= i;
            }
        }

        return answer;
    }
}
