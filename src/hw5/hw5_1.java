package hw5;

import java.util.Scanner;

/*
請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形,如
圖:
*/
public class hw5_1 {
	
	public static void main(String[] args) {
		System.out.println("請輸入*號的寬與高");
		Scanner sc = new Scanner(System.in);
		int width=sc.nextInt();
		int height=sc.nextInt();
		sc.close();
		starSquare(width,height);
		
	}

	private static void starSquare(int width, int height) {
		for(int i = 0; i < height; i++) {
			for(int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
	        }
	}
}
