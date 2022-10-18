package GREEDY;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * 옛날 옛적에 수학이 항상 큰 골칫거리였던 나라가 있었다. 이 나라의 국왕 김지민은 다음과 같은 문제를 내고 큰 상금을 걸었다.
 * 길이가 N인 정수 배열 A와 B가 있다. 다음과 같이 함수 S를 정의하자.
 * S = A[0] × B[0] + ... + A[N-1] × B[N-1]
 * S의 값을 가장 작게 만들기 위해 A의 수를 재배열하자. 단, B에 있는 수는 재배열하면 안 된다.
 * S의 최솟값을 출력하는 프로그램을 작성하시오.
 */
public class B1026_보물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        for(int i = 0 ; i < n; i++){
            a.add(sc.nextInt());
        }
        
        for(int i = 0 ; i < n; i++){ 
            b.add(sc.nextInt());
        }
        
        int sum = 0;

        for(int i = 0 ; i < n; i ++){
            sum += Collections.min(a) * Collections.max(b); // A배열의 최소값과 B배열의 최대값을 곱함

            a.remove(Integer.valueOf(Collections.min(a)));  // 각 배열의 최소값 최대값을 삭제
            b.remove(Integer.valueOf(Collections.max(b)));
        }

        System.out.println(sum);

    }
}
