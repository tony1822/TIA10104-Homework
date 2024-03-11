	package HW8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Hw8_2 {
	public static void main(String[] args) {
		//設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
		//需使用的集合裡
		Train t1=new  Train (202,"普悠瑪","樹林","花蓮",(double)400);
		Train t2=new  Train (1254,"區間","屏東","基隆",(double)700);
		Train t3=new  Train (118,"自強","高雄","台北",(double)500);
		Train t4=new  Train (1288,"區間","新竹","基隆",(double)400);
		Train t5=new  Train (122,"自強","台中","花蓮",(double)600);
		Train t6=new  Train (1222,"區間","樹林","七堵",(double)300);
		Train t7=new  Train (1254,"區間","屏東","基隆",(double)700);
		Set trainSet =new HashSet();
		trainSet.add(t1);
        trainSet.add(t2);
        trainSet.add(t3);
        trainSet.add(t4);
        trainSet.add(t5);
        trainSet.add(t6);
        trainSet.add(t7);
        //請寫一隻程式,能印出不重複的Train物件
			Iterator it=trainSet.iterator();
			while(it.hasNext()) {
				Train train=(Train)it.next();
				System.out.println(train.getNumber()+","+train.getType()+","+train.getStart()+","+train.getDest()+","+train.getPrice()+"\t");		
			}
			System.out.println("=============================================");
//			請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
//			承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
			Set <Train>se2=new TreeSet();
			se2.add(t1);
			se2.add(t2);
			se2.add(t3);
			se2.add(t4);
			se2.add(t5);
			se2.add(t6);
			se2.add(t7);
			//使用迭代器
			Iterator<Train> it1=se2.iterator();
			while(it1.hasNext()) {
				Train train1=(Train)it1.next();
				System.out.println(train1.getNumber()+","+train1.getType()+","+train1.getStart()+","+train1.getDest()+","+train1.getPrice()+"\t");		
			}
			
			System.out.println("=============================================");
			//使用foreach迴圈
			for(Train train:se2) {
				System.out.println(train.getNumber()+","+train.getType()+","+train.getStart()+","+train.getDest()+","+train.getPrice()+"\t");
			}
	   }
	}
