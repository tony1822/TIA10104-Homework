package HW4;

import java.util.Arrays;
import java.util.Scanner;

public class Hw4_1 {

	public static void main(String[] args) {
		// 有個一維陣列如下:
		// 請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int arr[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int total = 0;
		double to;
		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println("此陣列所有元素的平均值為" + (to = total / arr.length));
		System.out.println("大於平均值的元素為:");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > to) {
				System.out.print(arr[i] + "\t");
			}
		}
		System.out.println();
		System.out.println("=====================================================================");

//		請建立一個字串,經過程式執行後,輸入結果是反過來的
		String s = "Hello World";
		char[] arra = new char[20];
		for (int i = s.length() - 1; i >= 0; i--) {
			arra[i] = s.charAt(i);
			System.out.print(arra[i] + "");
		}
		System.out.println();
		System.out.println("=====================================================================");

//		• 有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

		String array[] = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };

		int total2 = 0;
		for (int i = 0; i < array.length; i++) {
			String a = array[i];
			for (int j = 0; j < array[i].length(); j++) {

				if (a.charAt(j) == ('a') || a.charAt(j) == ('e') || a.charAt(j) == ('i') || a.charAt(j) == ('o')
						|| a.charAt(j) == ('u')) {
					total2++;
				}

			}
		}
		System.out.println(total2);
		System.out.println("=====================================================================");

		// 請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
		// 有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
		// 員工編號: 25 19 27 共 3 人!」
		int ar[][] = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入要預借的金額");
		int total3 = 0;
		int an = sc.nextInt();
		System.out.println("有錢可借的員工為:");
		for (int i = 0; i < ar.length; i++) {
			for (int j = 1; j < ar[i].length; j++) {
				if (an <= ar[i][1]) {

					System.out.print(ar[i][0] + "\t");
					total3++;
				}
			}
		}

		System.out.println("共" + total3 + "人!");

		System.out.println("=====================================================================");
		// • 請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
		// 例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
		int[] arr3 = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		int x = 0; // 設立變數x是為了讓陣列可以依序相加
		int daytotal = 0;
		Scanner ss = new Scanner(System.in);
		System.out.println("請輸入西元yyyy年,mm月,dd日");
		int yy = ss.nextInt();
		int mm = ss.nextInt();
		int dd = ss.nextInt();

		if (yy % 4 == 0 && yy % 100 != 0 || yy % 400 == 0) { // 判斷是否為閏年，是的話讓2月天數加一
			arr3[1]++;
		}
		for (int i = 1; i <= mm - 1; i++) {
			if (mm == 2 && dd > 29) {
				System.out.println("2月不應該超過29天!"); // 防止2月超過29天
				daytotal = 0;
				dd = 0;
			} else {
				daytotal += arr3[x]; // 進行天數計算x代表從索引0(第一個月)開始計算
				x++;
			}
		}
		System.out.println("輸入的日期為該年第" + (daytotal + dd) + "天");
		
			//		班上有8位同學,他們進行了6次考試結果如下:
					int[][]ex= {
					{10,35,40,100,90,85,75,70},
					{37,75,77,89,64,75,70,95},
					{100,70,79,90,75,70,79,90},
					{77,95,70,89,60,75,85,89},
					{98,70,89,90,75,90,89,90},
					{90,80,100,75,50,20,99,75},
					};
			int ex1[] = new int[8];// 宣告空一維陣列來當同學次數的計算
			for (int i = 0; i < ex.length; i++) {
			int max = ex[i][0]; // 宣告max來當作第每列第一個數字來比出最大值
			int p = 0;
			int last = 0;
			for (int j = 1; j < ex[i].length; j++) {
			p++;
			if (ex[i][j] > max) { // 當後面的數字有比max大就給他賦值以此來找出最大值
			max = ex[i][j];
			last = j;// 這邊的last是來儲存最大max值得索引[j]以此來知道是哪位同學要加1
			}
			if (p == 7) { // 當全部數字跑完時，就會把last當作ex1陣列的索引值(學號)然後加1做計算，
				ex1[last] += 1; // 以此類推跑完6列
			}
		}

	}
	System.out.println("1號同學考最高分的次數=" + ex1[0]);
	System.out.println("2號同學考最高分的次數=" + ex1[1]);
	System.out.println("3號同學考最高分的次數=" + ex1[2]);
	System.out.println("4號同學考最高分的次數=" + ex1[3]);
	System.out.println("5號同學考最高分的次數=" + ex1[4]);
	System.out.println("6號同學考最高分的次數=" + ex1[5]);
	System.out.println("7號同學考最高分的次數=" + ex1[6]);
	System.out.println("8號同學考最高分的次數=" + ex1[7]);
}
}
