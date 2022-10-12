package DP;

import java.util.Scanner;

/*
 * 춘향이는 편의점 카운터에서 일한다.
 * 손님이 2원짜리와 5원짜리로만 거스름돈을 달라고 한다. 
 * 2원짜리 동전과 5원짜리 동전은 무한정 많이 가지고 있다. 
 * 동전의 개수가 최소가 되도록 거슬러 주어야 한다. 
 * 거스름돈이 n인 경우, 최소 동전의 개수가 몇 개인지 알려주는 프로그램을 작성하시오.
 * 예를 들어, 거스름돈이 15원이면 5원짜리 3개를, 거스름돈이 14원이면 5원짜리 2개와 2원짜리 2개로 총 4개를, 
 * 거스름돈이 13원이면 5원짜리 1개와 2원짜리 4개로 총 5개를 주어야 동전의 개수가 최소가 된다.
 */
public class B14916_거스름돈 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        clac(n);
    }
    
    public static void clac(int n){
        int sum = 0 ; 
        
        while(n > 0){
            if(n % 5 == 0){ // 5로 나눈 나머지가 0이면 동전이 최대치
                sum = n/5 + (sum);  //5로 나눈나머지 + 2원씩 뺀 횟수
                break;
            }

            n -= 2; // 2씩 빼서 5로 나눠지는지 다시 계산
            sum++;  // 2씩 뺀 만큼 2횟수 증가
        }
        
        if(n < 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
        }
        
    }
}
