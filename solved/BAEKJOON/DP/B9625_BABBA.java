package DP;

/*
 * 상근이는 길을 걷다가 신기한 기계를 발견했다. 
 * 기계는 매우 매우 큰 화면과 버튼 하나로 이루어져 있다.
 * 기계를 발견했을 때, 화면에는 A만 표시되어져 있었다. 
 * 버튼을 누르니 글자가 B로 변했다. 
 * 한 번 더 누르니 BA로 바뀌고, 그 다음에는 BAB, 그리고 BABBA로 바뀌었다. 
 * 상근이는 화면의 모든 B는 BA로 바뀌고, A는 B로 바뀐다는 사실을 알게되었다.
 * 버튼을 K번 눌렀을 때, 화면에 A와 B의 개수는 몇 개가 될까?
 */

import java.util.Scanner;

public class B9625_BABBA {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        
        dp(k);
    }
        
        public static void dp(int k){
// k = 1 :: 0 , 1 B
// k = 2 :: 1 , 1 BA
// k = 3 :: 1 , 2 BAB
// k = 4 :: 2 , 3 BABBA
// k = 5 :: 3 , 5 BABBABAB
// k = 6 :: 5 , 8 BABBABABBABBA
// k = 7 :: 8 , 13 BABBABABBABBABABBABAB
// k++ 할때마다 A = k-1의 B갯수, B는 k-1의 A+B갯수
            if(k == 1){ 
                System.out.println(0 + " " + 1);
            }   else   {
                int arr1[] = new int[k];    //a배열
                int arr2[] = new int[k];    //b배열
                arr1[0] = 0;    //초기값 a = 0
                arr2[0] = 1;    //초기값 b = 0

                for(int i = 1 ; i < k; i++){// k++ 할때마다 A = k-1의 B갯수, B는 k-1의 A+B갯수
                    arr1[i] = arr2[i-1];
                    arr2[i] = arr1[i-1]+arr2[i-1];
                    
                }
                System.out.println(arr1[k-1] + " " + arr2[k-1]);
            }   
        }
}
