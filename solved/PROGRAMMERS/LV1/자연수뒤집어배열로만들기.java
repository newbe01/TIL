package solved.PROGRAMMERS.LV1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/*
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */

public class 자연수뒤집어배열로만들기{
    public static int[] solution(long n) {
        
        String m = Long.toString(n);    //자릿수를 알기위해 형변환
        int[] answer = new int[m.length()];
        int cnt = 0;
        
        for(int i = m.length()-1; i >= 0 ; i--){    //거꾸로 반복하면서 배열저장
            answer[cnt] = m.charAt(i)-'0';          //배열은 정순서 이어야하기때문에 0부터
            cnt++;
        }
        
        // 정배열로 담아 역배열 sort 
        // Integer[] answer = new Integer[m.length()];
        // for(int i = 0; i < m.length(); i++){
        //     answer[i] = m.charAt(i)-'0';
        // }
        
        // Arrays.sort(answer,Comparator.reverseOrder());

        return answer;
    }
}