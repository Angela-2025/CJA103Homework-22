package hw5;
/*利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
可以找出二維陣列的最大值並回傳
*/
public class hw5_3 {
	
	public int maxElement(int[][] x) {
		int max = x[0][0];
		for (int[] row : x ) {
			for (int v : row) { 
				if (v > max) { 
					max = v;
				}
			}
		}
	       return max;
	 }
    public double maxElement(double[][] x) {
        double max = x[0][0];
        for (double[] row : x) {
            for (double v : row) {
                if (v > max) {
                    max = v;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[][] intArray = {
                {1, 6, 3},
                {9, 5, 2}
        };

        double[][] doubleArray = {
                {1.2, 3.5, 2.2},
                {7.4, 2.1, 8.2}
        };

        hw5_3 w = new hw5_3();
        System.out.println(w.maxElement(intArray));     
        System.out.println(w.maxElement(doubleArray));  
    }	

}
