package HW4;

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
		}System.out.println(total2);
		System.out.println("=====================================================================");
		
			//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
			//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
			//		員工編號: 25 19 27 共 3 人!」
	}
}
