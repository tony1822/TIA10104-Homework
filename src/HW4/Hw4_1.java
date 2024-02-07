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

//		請建立一個字串,經過程式執行後,輸入結果是反過來的

	}

}
