package HW10;

public class Hw10_1 {
	public static void main(String[] args) {
		//請設計一隻程式,用亂數產生5個介於1~100之間的整數,而輸出結果可以判斷出這5個整數為是否
//		為質數 (提示:Math類別)
		int i=0;
		while(i<5) {
			int number = (int) (Math.random() * 100) + 1;
				if(prime(number)) {
					System.out.println(number+"是質數"+"\t");
					i++;
				}else if(!prime(number)) {
					System.out.println(number+"不是質數"+"\t");
					i++;
				}
			}
		}
			public static boolean prime(int number) {
				if(number==1) {
					return false;
				}
				
			for (int j = 2; j < number; j++) {
				if (number % j == 0) {
					return false;
				} 
			}
			
				return true;
		}
}
