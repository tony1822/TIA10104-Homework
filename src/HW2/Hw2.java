package HW2;

public class Hw2 {
	public static void main(String[] args) {
		// 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int a = 0;
		for (int i = 1; i <= 1000; i++) {
			if (i % 2 == 0) {
				a += i;
			}
		}
		System.out.println("1~1000的偶數和=" + a);
		System.out.println("===========================================================");
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
		int b = 1;
		for (int i = 2; i <= 10; i++) {
			b *= i;
		}
		System.out.println("1~10的連乘積=" + b);
		System.out.println("===========================================================");
		// 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
		int c = 1;
		int d = 2;
		while (d <= 10) {
			c *= d;
			d++;
		}
		System.out.println("1~10的連乘積=" + c);
		System.out.println("===========================================================");
		// 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
		int totals = 0; // 數字之間相差是1 3 5 7 9 11 13 15 17 19 基數
						// 所以先用迴圈挑出來基數的數字，再依序相加列印出來。
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 1) {
				totals += i;
				System.out.print(totals + "\t");
			}
		}
		System.out.println();
		System.out.println("====================================================================");

		// 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
		// 輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
			int total=0;
			for(int i=1;i<=49;i++) {
				if(i/10==4||i%10==4) {
					continue;					
				}
				System.out.print(i+", ");	
				total++;
			}System.out.println();
			
			
			System.out.println("總共有="+total+"個");
			System.out.println("========================================================================================================================");

		
		// 請設計一隻Java程式,輸出結果為以下:
		for (int i = 11; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}System.out.println();
		}
		
		System.out.println("=============================================================================");
		// 請設計一隻Java程式,輸出結果為以下:
			
		int u =65;
		for(int i=1;i<=6;i++) {
			for(int j=0;j<i;j++) {				
				System.out.print((char)(u));				
			}System.out.println();	u++;
		}
		
		System.out.println("========================================================");
		
		
		// 使用for+while輸出九九乘法算數
				for (int i = 1; i <= 9; i++) {
					int j = 1;
					while (j <= 9) {
						System.out.print(i + "*" + j + "=" + i * j + "\t");
						j++;
					}
				}
				System.out.println("");
				System.out.println("");
				System.out.println("");

				// 使用for+do while輸出九九乘法算數
				for (int i = 1; i <= 9; i++) {
					int j = 1;
					do {
						System.out.print(i + "*" + j + "=" + i * j + "\t");
						j++;
					} while (j <= 9);
				}

				System.out.println("");
				System.out.println("");
				System.out.println("");

				// 使用while+do while輸出九九乘法算數
				int i = 1;
				while (i <= 9) {
					int j = 1;
					do {
						System.out.print(i + "*" + j + "=" + i * j + "\t");
						j++;
					} while (j <= 9);
					i++;
				}

		
	}
}
