package solved.PROGRAMMERS.LV1;


/*
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. 
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다. numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 */
public class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean arr[] = new boolean[10];

        for(int i = 0 ; i < numbers.length; i++){   //없는값을 찾기위해
            arr[numbers[i]] = true;                 //arr 배열에 없는값을 false처리        
        }

        for(int i = 0 ; i < arr.length; i++){   //false 면 없는 수기이때문에 더함
            if(!arr[i]){
                answer += i;
            }
        }
        return answer;
    }
}
