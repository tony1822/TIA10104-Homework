package HW10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Hw10_3 {
public static void main(String[] args) {
	//請設計一隻程式,讓使用者輸入日期(年月日,例如:20110131)後,可以轉成想要的輸出格式化成
	String regex="^\\d{4}[0][1-9][0-3]\\d$";
	Scanner sc =new Scanner(System.in);
	System.out.println("請輸入日期(年月日,例如:20110131)");
	String date =sc.next();
	while(!date.matches(regex)) {
		System.out.println("日期格式不正確,請再輸入一次!");
		System.out.println("請輸入日期(年月日,例如:20110131)");
		date =sc.next();
	}
	System.out.println("欲格式化成為(1)年/月/日 (2)月/日/年 (3)日/月/年:");
	int ch=sc.nextInt();
//先宣告一個SimpleDateFormat格式模板，使用者輸入的20110131就可以對應到此模板變成日期，接著去變化想要的日期呈現方式
	SimpleDateFormat sim= new SimpleDateFormat("yyyyMMdd");
	switch(ch) {
	case 1:
		 try {
			 //要先將一開始使用者輸入的date轉換成日期格式，此日期格式就是我們上面定義的sim，才可以接著操作
				Date pa= sim.parse(date);
			//因為已經轉換成模板格式了，所以可以再	宣告一個SimpleDateFormat物件然後定義想要自訂的模板					
			 SimpleDateFormat sim2= new SimpleDateFormat("yyyy/MM/dd");
			 //因為已經有date格式的模板了pa所以可以把它丟進去sim2格式化成自定義日期格式
			String fo=sim2.format(pa);
			System.out.println("年/月/日:"+fo);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		break;
	case 2:
		 try {
			 SimpleDateFormat sim2= new SimpleDateFormat("MM/dd/yyyy");
			Date pa= sim.parse(date);
			String fo=sim2.format(pa);
			System.out.println("月/日/年:"+fo);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
		
	case 3:
		 try {
			 SimpleDateFormat sim2= new SimpleDateFormat("dd/MM/yyyy");
			Date pa= sim.parse(date);
			String fo=sim2.format(pa);
			System.out.println("日/月/年:"+fo);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		break;
	}
	
	
	
}
}
