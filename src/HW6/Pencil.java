package HW6;

public class Pencil extends Pen {

	public Pencil(int price) {
		super.setPrice(price);
	};
	
	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("削鉛筆在寫");
	}
	
	public int getPrice() {
		int t=(int)(super.getPrice()*0.8);
		System.out.println(t);
		return t;
	}
	

}
