package HW9;

public class Hw9_2 {
	public static void main(String[] args) {
		Account ac=new Account();
		Mom mom=new Mom(ac);
		Son son=new Son(ac);
		mom.start();
		son.start();
	}
}

class Account {
	private int stock = 0;
	synchronized public void save(int money) {
		while (stock > 3000) {
			System.out.println("媽媽看到餘額大於3000，停止匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		stock += money;
		System.out.println("媽媽存了:" + money + "目前餘額:" + stock);
		notify();
	}
	
	
	synchronized public void withdraw(int money) {
		while (stock <money) {
			System.out.println("雄大看到帳戶沒錢，暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		stock -= money;
		System.out.println("雄大領了:" + money + "帳戶共有:" + stock);
		if(stock<2000) {
			System.out.println("雄大看到餘額在2000以下，要求匯款");
			notify();
		}
	}
		
}

class Mom extends Thread {
	Account ac;

	public Mom(Account ac) {
		this.ac = ac;
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
				ac.save(2000);
		}
	}

}

class Son extends Thread{
	Account ac;
	public Son(Account ac) {
		this.ac=ac;
	}
	public void run() {

		for (int i = 0; i < 10; i++) {
				ac.withdraw(1000);
		}
	}
	
}