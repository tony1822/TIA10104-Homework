package HW1;

public class Hw1 {
	public static void main(String[] args) {
	  //作業(1):請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a =12;   int b =6;     
		int sum1=a+b; int sum2=a*b; 
		System.out.println("12+6="+sum1);
		System.out.println("12*6="+sum2);
		System.out.println("==================================================");
		//作業(2):請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int eggs=200; int quantity=12;
		int sum3 =eggs/quantity;  //用運算子'/'算出幾打  
		int sum4=eggs%quantity; //用取餘數運算子'%'算出幾顆
		System.out.println("200顆蛋總共是"+sum3+"打");
		System.out.println("200顆蛋總共是"+sum4+"顆");
		System.out.println("==================================================");
		//作業(3):請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day=24*60*60; int sec=256559; int hour=60*60; ; int minute=60;
		    //算出一天有幾秒，一小時有幾秒
		int day1=sec/day; sec=sec-(day1*24*60*60); //day1儲存總共有幾天，再把總秒數減天換算秒算出剩餘秒數
		int hour1=sec/hour; sec=sec-hour1*60*60; //hour1儲存總共有幾小時，再拿剩餘秒減去小時換算秒
		 minute =sec/minute; //minute儲存有幾分鐘
		sec=sec-minute*60;  // 算出剩下幾秒
		System.out.println("256559總共為"+day1+"天"+hour1+"小時"+minute+"分"+sec+"秒");
		
		 System.out.println("==================================================");
			
		//作業(4):請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		final double pi=3.1415;   int radius=5;  //radius是半徑5
		 double sum5= radius*radius*pi;  //此為圓面積算法半徑*半徑*圓周率
		 double sum6= radius*2*pi;   // 此為圓周長算法半徑*2*圓周率
		 System.out.println("圓面積="+sum5);
		 System.out.println("圓周長="+sum6);
		 System.out.println("==================================================");
//		 作業(5):某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		 金加利息共有多少錢 (用複利計算,公式請自行google)
		 // 複利本金和的公式= 本金*（1+利率）時間次方
		 		int deposit=1_500_000;  double rate =0.02; //宣告本金跟利率
		 		double sav =(1+rate);     //宣告一個變數存取(1+利率)10次方的結果
		 		for(int i=1;i<10;i++) {	  //這邊搭配for迴圈算出利率10次方	
		 			sav=(sav*(1+rate));
		 		}
		 		System.out.println("10年後本金加利息共有="+deposit*sav+"元");	//本金*（1+利率）時間次方
		 		System.out.println("==================================================");
		 		
		      //作業(6):請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		 		5 + 5
//		 		5 + ‘5’
//		 		5 + “5”
//		 		並請用註解各別說明答案的產生原因
          System.out.println(5+5);//這兩個5分別都是"int"類型的數值,所以用算術運算子+會得到和為10。
          
		  System.out.println(5+'5');//查看"unicode"編碼char'5'代表0x35的十六進位值,
		                            // 用小算盤換算出十進位值為53,所以和數值5的和為58。
		  
		  System.out.println(5+"5");//數值類型的5加上string類型的"5"會變成字串相加,所以答案為字串55。

		  
		  
					}
									}
