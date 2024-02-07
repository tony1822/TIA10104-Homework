package HW3;

import java.util.Scanner;

public class Hw3_3 {
	public static void main(String[] args) {
//		阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//		厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//		的號碼與總數,如圖:
		Hw3_3 hw= new Hw3_3();
		int total = 0;
		Scanner sb = new Scanner(System.in);
		System.out.println("阿文，請輸入你討厭哪個數字?(1~9)");
		int v = sb.nextInt();
		hw.choose(v);
	
	}

	public  void choose(int v) {
		int total = 0;
		for (int i = 1; i <= 49; i++) {
			if (i / 10 == v || i % 10 == v) {
				continue;
			}
			System.out.print(i + ", ");
			total++;
		}
		System.out.println();

		System.out.println("總共有=" + total + "個");
	}
}
