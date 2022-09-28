package solved.PROGRAMMERS.LV1;

/*
 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다. 
 */

public class 평균구하기 {
    public double solution(int[] arr) {
        double answer = 0;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){ //길이만큼 돌면서 sum 에 값 더함
            sum += arr[i];
        }

        answer = sum / (double)arr.length;  // 합계를 길이로나눔 소수점 반환해야하기때문에 double 형변환

        return answer;
    }
    
}
