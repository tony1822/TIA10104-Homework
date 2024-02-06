package HW3;

import java.util.Scanner;

public class Hw3 {
	public static void main(String[] args) {
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:
		int arr[] = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三個數字:");
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		if (arr[0]==0||arr[1]==0||arr[2]==0) {
			System.out.println("不是三角形");
		} else if (arr[0] == arr[1] && arr[1] == arr[2]) {
			System.out.println("為正三角形");
		} else if (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2]) {
			System.out.println("為其他三角形");
		} else if (arr[0] == arr[1] || arr[1] == arr[2] || arr[0] == arr[2]) {
			System.out.println("等腰三角形");
		} 
	}
}