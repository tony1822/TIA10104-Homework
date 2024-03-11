package HW7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Hw_Test_Animal {
	public static void main(String[] args) throws ClassNotFoundException {
//		private static final long seriaLVersionUID =1L;
		 File fi=new File("C://data");
		 if(!fi.exists()) {
			 fi.mkdir();
		 }
		 
		 File f2 = new File("C://data//Object.ser");
	       
	        
		 	Animal [] an=new Animal[4];
		 	an[0]=new Dog("popo");
		 	an[1]=new Dog("koko");
		 	an[2]=new Cat("miumiu");
		 	an[3]=new Cat("yoyo");
		 	try {
				FileOutputStream fil=new FileOutputStream(f2);
				ObjectOutputStream ou=new ObjectOutputStream(fil);
				for(int i=0;i<an.length;i++) {
					ou.writeObject(an[i]);
				}
				ou.close();
				fil.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	
		 	try {
				FileInputStream fl=new FileInputStream("C://data//Object.ser");
				ObjectInputStream obje=new ObjectInputStream(fl);
				
				try {
				while(true) {
					((Animal)obje.readObject()).speak();
				}
			}catch(EOFException e) {
				System.out.println("資料讀取完畢!");
			}
				obje.close();
				fl.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 	
		 	
		
		
	}
}
