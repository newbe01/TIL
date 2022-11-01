package solved.PROGRAMMERS.LV1;

/*
 * 자연수 n이 매개변수로 주어집니다. 
 * n을 3진법 상에서 앞뒤로 뒤집은 후, 
 * 이를 다시 10진법으로 표현한 수를 return 하도록 solution 함수를 완성해주세요.
 * 제한사항
 * n은 1 이상 100,000,000 이하인 자연수입니다.
 */
public class 삼진법뒤집기 {
    public static void main(String[] args) {
        solution(125);
    }
    public static int solution(int n) {
        int answer = 0;
        
        String reverse = "";
        
        while(true){ 
            //3진법수로 계산후 담기
            //계산방식때문에 자동으로 역순으로 담김
            if(n < 3){
                reverse += n;
                break;
            }

            reverse += n % 3;
            n /= 3;

        }
        
        StringBuffer sb = new StringBuffer(reverse);
        reverse = sb.reverse().toString();  
        //계산하기 편하게 정순으로 변환
        
        for(int i = 0; i < reverse.length(); i++){
            //3진법으로 계산후 더하기
            answer += (reverse.charAt(i)-'0') * (Math.pow(3, i));
        }

        return answer;
    }
}
