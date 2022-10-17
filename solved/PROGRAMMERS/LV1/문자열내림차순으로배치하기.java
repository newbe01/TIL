package solved.PROGRAMMERS.LV1;

import java.util.Arrays;

/*
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 * 
 */
public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Zbcdefg"));
    
    }
    public static class Solution {
        public String solution(String s) {
            String answer = "";

            char arr[] = s.toCharArray(); //문자열을 char 배열로 만들기

            Arrays.sort(arr);   //오름차순으로 정렬
            
            for(int i = arr.length-1; i >= 0; i--){ // 역순으로 정답에 담기
                answer += arr[i];
            }

            return answer;
        }
    }
}
