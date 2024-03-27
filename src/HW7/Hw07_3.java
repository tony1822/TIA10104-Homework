package HW7;

import java.io.*;



public class Hw07_3 {
	
	public static void copyfile(String a1,String a2) {
		try {
			File intput =new File(a1);
			File ontput =new File(a2);
			FileInputStream in =new FileInputStream(intput);
			FileOutputStream ou=new FileOutputStream(ontput,true);
			int tex;
			
			while((tex=in.read())!=-1) {
				ou.write(tex);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		String a1="files//f1";
		String a2="files//f2";
		copyfile(a1,a2);
	}
}
