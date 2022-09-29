package solved.PROGRAMMERS.LV1;

/*
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String m = Integer.toString(n); //자릿수 구하기위해 형변환

        for(int i = 0 ; i <m.length(); i++){
            answer += m.charAt(i) - '0'; //캐릭터형으로 변환수 -'0' 으로 int 형변환
        }

        return answer;
    }
}
