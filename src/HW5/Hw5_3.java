package HW5;

public class Hw5_3 {
	public static void main(String[] args) {
		Hw5_3 hw = new Hw5_3();
		hw.getAuthCode();
	}
	//while的條件負責檢查random的數字是否在91-96 (91-96沒辦法轉換成要的字母)，如果是的話
	//do-while迴圈會繼續升成隨機數字直到不等於while，然後把
	//random賦值給arr1陣列，跳出去執行下一次for迴圈
	//，直到arr.length跑完	
	public void getAuthCode() {
		int[] number = new int[8]; // 儲存0-9數字
		int asc[] = new int[8]; // 儲存要轉換成字母(ASCII)的數字
		for (int i = 0; i < asc.length; i++) {
			number[i] = (int) (Math.random() * 10);
			int random;
			do {
				random = (int) (Math.random() * (122 - 65 + 1)) + 65;
			} while (random >= 91 && random <= 96);
			asc[i] = (int) random;
		}												
		System.out.println("本次隨機產生驗證碼為:");
		for (int i = 0; i < 4; i++) {
			System.out.print((char) asc[i]);
			System.out.print(number[i]);
		}
	}
}