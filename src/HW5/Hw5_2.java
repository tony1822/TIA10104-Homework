package HW5;

 public class Hw5_2 {
	// 利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double
	// x[][]),
	// 可以找出二維陣列的最大值並回傳,如圖:
		public int maxElement(int x[][]) {
		int c = 0;		//儲存索引的最大值順便當作比較的依據
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (c < x[i][j]) {
					c = x[i][j];    
				}
			}
		}
		return c;
	};

		public double maxElement(double x[][]) {
		double A = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if ( A < x[i][j]) {
					A = x[i][j];
				}
			}
		}
		return A;
	};

	 
	public static void main(String[] args) {
		int[][] intArray = { { 1, 6, 3 }, { 9, 5, 2 } };
		  double[][] doubleArray = { { 1.2, 3.5, 2.2 }, { 7.4, 2.1, 8.2 } };
		Hw5_2 hw= new Hw5_2();
		System.out.println(hw.maxElement(intArray));
		System.out.println(hw.maxElement(doubleArray));
	}

}

	