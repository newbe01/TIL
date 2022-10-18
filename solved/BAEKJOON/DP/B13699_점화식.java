package DP;

import java.util.Scanner;

/*
 * 다음의 점화식에 의해 정의된 수열 t(n)을 생각하자:
 * t(0)=1
 * t(n)=t(0)*t(n-1)+t(1)*t(n-2)+...+t(n-1)*t(0)
 * 이 정의에 따르면,
 * t(1)=t(0)*t(0)=1
 * t(2)=t(0)*t(1)+t(1)*t(0)=2
 * t(3)=t(0)*t(2)+t(1)*t(1)+t(2)*t(0)=5
 * ...
 * 주어진 입력 0 ≤ n ≤ 35에 대하여 t(n)을 출력하는 프로그램을 작성하시오.
 */
public class B13699_점화식{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(calc(n));
    
    }
        public static long calc(int n){
        long arr[] = new long[36];
        arr[0] = 1;
        int cnt = 0;
        long sum = 0;
        
        for(int i = 1 ; i < arr.length ; i++){
            cnt = 0;
            sum = 0;
            while(cnt <= i - 1 ){ //0부터 n-1까지 증가하면서 반복
                sum += arr[cnt] * arr[(i-1) - cnt]; //각 순서별로 합계를 더함
                cnt++;
                }
            arr[i] = sum;
        }

        return arr[n];
    }
}
