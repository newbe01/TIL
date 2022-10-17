package DP;

import java.util.Scanner;

/*
 * N개의 실수가 있을 때, 한 개 이상의 연속된 수들의 곱이 최대가 되는 부분을 찾아, 그 곱을 출력하는 프로그램을 작성하시오. 
 * 예를 들어 아래와 같이 8개의 양의 실수가 주어진다면,
 * 1.1 , 0.7 , 1.3 , 0.9 , 1.4 , 0.8 , 0.7 , 1.4
 * 색칠된 부분의 곱이 최대가 되며, 그 값은 1.638이다.
 */
public class B2670_연속부분최대곱 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        double arr[] = new double[t];
        
        for(int i = 0 ; i < t; i++){
            arr[i] = sc.nextDouble();
        }
        
  
        double max = arr[0];

        for(int i = 1 ; i < arr.length; i++){
            arr[i] = Math.max(arr[i], arr[i] * arr[i-1]); 
            // 배열을 초기화하면서 최대값 갱신
            //i 번째 수와 i * i-1 번째 수중 큰수를 배열로 새로 저장
            //가장큰수를 초기화

            max = Math.max(arr[i], max);
        }

        System.out.printf("%.3f",max);
    }
}
