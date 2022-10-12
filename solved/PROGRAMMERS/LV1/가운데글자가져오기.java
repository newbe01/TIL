package solved.PROGRAMMERS.LV1;

/*
 * 단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 
 * 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
 * 재한사항
 * s는 길이가 1 이상, 100이하인 스트링입니다.
 */
public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";

        int leng = s.length();

        if(leng % 2 == 0){ //짝수라면 가운데 2글자 리턴
            answer += s.substring((leng/2)-1, (leng/2)+1);
        }else{  //홀수라면 가운데 숫자를 리턴  
            answer += s.charAt(leng/2);
        }

        return answer;
    }
}
