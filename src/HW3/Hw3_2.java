package HW3;

import java.util.Scanner;

public class Hw3_2 {
	public static void main(String[] args) {
//		請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
//		對則顯示正確訊息,如圖示結果:
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧!");
		int p = (int) (Math.random() * 10);

		while (true) {
			int o = sc.nextInt();
			if (p != o) {
				System.out.println("答錯了");
			} else {
				System.out.println("答對了!答案就是" + o);
				break;
			}
		}
	}
}