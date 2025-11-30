package hw4;

/*有個一維陣列如下:
 
{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
(提示:陣列,length屬性)*/

import java.util.ArrayList;

	public class hw4_1 {
		
		public static void main(String[] args) {
			int array[] = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
			double average = getAverageOfArray(array);
			ArrayList<Integer> elementsAvg = getElementsAvg(array, average);
			System.out.println("AVG = " + average + " 大於平均值的元素 " + elementsAvg);
		}

		public static double getAverageOfArray(int array[]) {
			int sum = 0;
			for (int i = 0; i < array.length; i++) {
				sum += array[i];
			}
			return ( (double) sum / array.length);
		}

		public static ArrayList<Integer> getElementsAvg(int array[], double avg) {
			ArrayList<Integer> numbers = new ArrayList<>();
			for (int i = 0; i < array.length; i++) {
				if (array[i] > avg)
					numbers.add(array[i]);
			}
			return numbers;
		}

	}
