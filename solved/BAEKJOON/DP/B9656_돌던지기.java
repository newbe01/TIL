package DP;

/*
 * 돌 게임은 두 명이서 즐기는 재밌는 게임이다.
 * 탁자 위에 돌 N개가 있다. 
 * 상근이와 창영이는 턴을 번갈아가면서 돌을 가져가며, 
 * 돌은 1개 또는 3개 가져갈 수 있다. 
 * 마지막 돌을 가져가는 사람이 게임을 지게 된다.
 * 두 사람이 완벽하게 게임을 했을 때, 이기는 사람을 구하는 프로그램을 작성하시오. 
 * 게임은 상근이가 먼저 시작한다.
 */
import java.util.Scanner;

public class B9656_돌던지기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        calc(n);
    }

    public static void calc(int n){
// n = 1 창영 승
// n = 2 상근 승 1 > 1
// n = 3 창영 승 1 > 1 > 1      / 3 > 0
// n = 4 상근 승 1 > 1 > 1 > 1  / 3 > 1
// n = 5 창영 승 1 > 3 > 1      / 3 > 1 > 1
// n / = 0 의 경우 상근이 이길수있다. 

            if(n % 2 == 0){ 
                System.out.println("SK");
            }else{
                System.out.println("CY");
            }
    }
}
