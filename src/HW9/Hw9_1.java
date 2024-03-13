package HW9;

public class Hw9_1 implements Runnable{
	int count=0;
	public void run() {
		while(count<10) {
			count++;
			System.out.println("饅頭人吃第"+count+"飯");
			try {
				Thread.sleep((int)(Math.random()*3000)+500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("饅頭人吃完了!");
	}
	
	public static void main(String[] args) {
		System.out.println("----------大胃王快食比賽開始!----------");
		Hw9_1 hw=new Hw9_1();
		H2 h2=new H2();
		Thread tr =new Thread(hw);
		Thread tr2 =new Thread(h2);
		tr.start();
		tr2.start();
			try {
				tr.join();
				tr2.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("----------大胃王快食比賽結束!----------");
	}
	
}

class H2 implements Runnable{
	int count=0;
	public void run() {
		while(count<10) {
			count++;
			System.out.println("詹姆士吃第"+count+"飯");
			try {
				Thread.sleep((int)(Math.random()*3000)+500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("詹姆士吃完了!");
	}
	
}
