package GREEDY;

import java.util.Scanner;

/*
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다. 
 * 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 */
public class B11047_동전0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int arr[] = new int[n];

        for(int i = arr.length-1; i >= 0; i--){ //배열을 역순으로 저장해서 큰수부터 꺼냄
            arr[i] = sc.nextInt();
        }

        int cnt = 0;
        int sum = 0;
        while( k > 0 && cnt < n){
            sum += k / arr[cnt];    //동전 갯수는 k를 가장큰수로 나눈값을 계속 더함
            k = (k%arr[cnt]);       //나눈 나머지를 저장

            cnt++;
        }

        System.out.println(sum);
    }
}
