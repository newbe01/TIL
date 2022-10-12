package DP;

import java.util.Scanner;

/*
 * 0에서부터 9까지의 숫자로 이루어진 N개의 숫자가 나열된 수열이 있다. 
 * 그 수열 안에서 연속해서 커지거나(같은 것 포함), 
 * 혹은 연속해서 작아지는(같은 것 포함) 수열 중 가장 길이가 긴 것을 찾아내어 그 길이를 출력하는 프로그램을 작성하라. 
 * 예를 들어 수열 1, 2, 2, 4, 4, 5, 7, 7, 2 의 경우에는 1 ≤ 2 ≤ 2 ≤ 4 ≤ 4 ≤ 5 ≤ 7 ≤ 7 이 가장 긴 구간이 되므로 그 길이 8을 출력한다. 
 * 수열 4, 1, 3, 3, 2, 2, 9, 2, 3 의 경우에는 3 ≥ 3 ≥ 2 ≥ 2 가 가장 긴 구간이 되므로 그 길이 4를 출력한다. 
 * 또 1, 5, 3, 6, 4, 7, 1, 3, 2, 9, 5 의 경우에는 연속해서 커지거나 작아지는 수열의 길이가 3 이상인 경우가 없으므로 2를 출력하여야 한다.
 */
public class B2491_수열 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[sc.nextInt()];

        for(int i = 0 ; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        clac(arr);
    }

    public static void clac(int arr[]){
        int cnt = 1 ; 
        int cnt2 = 1;
        int max = 1 ; // 수열의 길이는 1부터들어감 0출력 방지

        for(int i = 0 ; i < arr.length -1; i++){ //커지는 배열 최대값구하기
                if(arr[i] <= arr[i+1]){ //다음수보다 클때 cnt +1
                    cnt++;
                }else{  //끊긴다면 길이 1로초기화
                    cnt = 1;
                }
            max = Math.max(max, cnt);
        }

        for(int i = 0 ; i < arr.length -1; i++){ //작아지는 배열 최대값 구하기
            if(arr[i] >= arr[i+1]){ //다음수보다 작을때 cnt +1
                cnt2++;
            }else{
                cnt2 = 1;
            }
            max = Math.max(max, cnt2);
    }


        System.out.println(max);

    }
}
