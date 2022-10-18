package solved.PROGRAMMERS.LV1;

import java.util.StringTokenizer;

/*
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */
public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution("  abc de    fghi    "));
    }
    public static String solution(String s) {
        String answer = "";

        String arr[] = s.split(""); //각문자를 다 잘라서 배열로 저장
        int cnt = 0;

        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i].equals(" ")){ //공백일경우 그대로
                cnt = 0 ;
            }else if(cnt % 2 == 0){ //0번부터 짝수라서 대문자 치환
                arr[i] = arr[i].toUpperCase();
                cnt++;
            }else if(cnt % 2 != 0){ //홀수번째는 소문자
                arr[i] = arr[i].toLowerCase();
                cnt++;
            }
        }
        return answer;
    }
}
