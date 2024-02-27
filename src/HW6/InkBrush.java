package HW6;

public class InkBrush extends Pen {
		
	public InkBrush(int price) {
		super.setPrice(price);
	};
		
		@Override
		void write() {
			// TODO Auto-generated method stub
			System.out.println("沾墨汁再寫");
		}
		
		public int getPrice() {
			int t=(int) (super.getPrice()*0.9);
			System.out.println(t);
			return t;
		}
	}
	

		
		
		
		
		
		
	
