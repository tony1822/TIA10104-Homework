package HW6;

public class Test {
	public static void main(String[] args) {
		Pen pe[]= new Pen[2];
		pe[0]=new Pencil(100);
		pe[1]=new InkBrush(100);
				
			for(int i=0;i<pe.length;i++) {
				pe[i].write();
				pe[i].getPrice();
			}
	}
	
	
	
}
