package solved.PROGRAMMERS.LV1;

import java.util.Arrays;

/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;

        String str = Long.toString(n);  
        char ca[] = str.toCharArray();  //String 으로 형변환후 char배열로만듬

        Arrays.sort(ca);    //배열 오름차순으로 정렬

        str = "";
        for(int i = ca.length-1 ; i >=0; i--){  //배열이 오름차순이라 역순으로 str저장
            str += ca[i];
        }

        answer = Long.parseLong(str); //long 으로 형변환

        return answer;
    } 
}
