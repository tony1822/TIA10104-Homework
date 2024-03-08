package HW7;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Hw7 {
//請寫一個程式讀取這個Sample.txt檔案,並輸出以下訊息:
	public static void main(String[] args) {
		int t1 = 0, t2 = 0, t3 = 0;
		int s;
		int y;
		String v;
		try {
			FileReader fr = new FileReader("c:\\Test\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((s = br.read()) != -1) {
				t1++;
			}
			br.close();
			fr.close();

		} catch (IOException e) {

		}

		try {
			FileInputStream fis2 = new FileInputStream("c:\\Test\\Sample.txt");
			BufferedInputStream bis = new BufferedInputStream(fis2);
			while ((y = bis.read()) != -1)
				t2++;
			bis.close();
			fis2.close();
		} catch (IOException e) {

		}

		try {
			FileReader fr = new FileReader("c:\\Test\\Sample.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((v = br.readLine()) != null) {
				t3++;
			}
			br.close();
			fr.close();

		} catch (IOException e) {

		}
		System.out.println("Sample.txt檔案共有"+t2+"個位元組,"+t1+"個字元,"+t3+"列資料");
	}

}
