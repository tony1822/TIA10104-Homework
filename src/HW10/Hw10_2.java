package HW10;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

public class Hw10_2 {
	public static void main(String[] args) {
		String regex = "[0-9]+(\\.[0-9]+)?";
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入數字");
		String an = sc.next();
		while (!an.matches(regex)) {
			System.out.println("數字格式不正確,請再輸入一次!");
			System.out.println("請輸入數字");
			an = sc.next();
		}
		System.out.println("欲格式化成(1)千分位(2)百分比(3)科學記號:");
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			//先將字串轉換成整數物件
			int an1 = Integer.parseInt(an);
			DecimalFormat ex = new DecimalFormat("#,###");
			System.out.println(ex.format(an1));
			break;
		case 2:
			//先將字串轉換成double類型物件放進去做百分比換算，會回傳格式化後的字串
			DecimalFormat df = new DecimalFormat("0%");
			double an2 = Double.parseDouble(an);
			String aa = df.format(an2);
			System.out.println(aa);
			break;
		case 3:
			DecimalFormat df1 = new DecimalFormat("0.0E00");
			double an3 = Double.parseDouble(an);
			String s1=df1.format(an3);
			System.out.println(s1);
		}

	}

}
