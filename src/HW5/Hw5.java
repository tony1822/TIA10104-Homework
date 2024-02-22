package HW5;

import java.util.Scanner;

public class Hw5 {
	//		請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
	//		圖:	
		public static void starSquare(int width, int height){
				 for(int i=0;i<height;i++) {
					 for(int j=0;j<width;j++) {
						 System.out.print("*");							
					 }
					 System.out.println("");
				 }				
			}
//		請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值,如圖:
		public static void randAvg() {
			System.out.println("本次亂數結果:");
			int total=0;
			int count=0;
			for(int i=0;i<10;i++) {
				int t=(int)(Math.random()*101);
				System.out.print(t+"\t");
				total+=t;
				count++;
			}System.out.println(total/count);
		}

		
		
		public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("輸入寬跟高");		
					int width=sc.nextInt();
					 int height=sc.nextInt();
					 starSquare(width,height);	//第一題方法呼叫	
					 
					 randAvg(); //第二題方法呼叫
					 
				}			
		}
	
