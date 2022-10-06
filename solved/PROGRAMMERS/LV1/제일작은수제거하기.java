package solved.PROGRAMMERS.LV1;

import java.util.Arrays;
/*
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 
 * 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        int answer[];

        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }else{
            answer = new int[arr.length-1];
            
            int arr1[] = arr.clone();   
            Arrays.sort(arr1);
            int min = arr1[0];

            int cnt =0; //continue 때문에 배열길이 밀려서 index 새로 생성
            for(int i =0; i < arr.length; i++){
                if(arr[i] == min){continue;} //최소값과 같으면 continue
                answer[cnt] = arr[i];
                cnt++;
            }
        }

        return answer;
    }
}
