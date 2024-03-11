package HW7;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
public class Hw07_2 {
	public static void main(String[] args) {
		try {
			FileOutputStream fo =new FileOutputStream("files//Data.txt",true);
			BufferedOutputStream bo =new BufferedOutputStream(fo);
			PrintStream pr =new PrintStream(bo);
			for(int i=1;i<=10;i++) {
				pr.println((int)(Math.random()*1000)+1);
			}
			pr.close();
			bo.close();
			fo.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
