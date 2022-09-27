package GREEDY;

import java.util.Scanner;
/*
 * 서로 다른 N개의 자연수의 합이 S라고 한다. S를 알 때, 자연수 N의 최댓값은 얼마일까?
 * 첫째 줄에 자연수 S(1 ≤ S ≤ 4,294,967,295)가 주어진다.
 */

public class B1789_수들의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long s = sc.nextLong(); //int 로 담을수없음
        int i = 0;
        while(true){ 
            if(s < 0){
                System.out.println(i-2);
                //순서대로 빼 가면서 최대값을 구함 0 부터시작했고, 넘어가는순간 더 크니까 -2
                break;
            }
            s -= i;
            i++;
        }
    }
}
