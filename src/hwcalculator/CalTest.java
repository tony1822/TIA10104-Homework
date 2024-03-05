package hwcalculator;

import java.util.Scanner;

public class CalTest {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			try {
				Calculator ca = new Calculator();
				Scanner sc = new Scanner(System.in);
				System.out.println("請輸入x的值:");
				int x = sc.nextInt();
				System.out.println("請輸入y的值:");
				int y = sc.nextInt();
				
				if (x == 0 && y == 0) {
					throw new CalException("0的0次方沒有意義!");
				} else if (y < 0) {
					throw new CalException("次方為負值，結果回傳不為整數");
				}
				System.out.println(x + "的" + y + "二次方等於" + ca.powerXY(x, x));
				break;
			} catch (CalException e) {
				System.out.println(e.getMessage());
			}
			;
		}

	}

}
