package hw4;
/*
請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天

例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」*/

import java.util.Scanner;

public class hw4_5 {
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);		
	System.out.println("請輸入三個整數，分別代表西元yyyy年，mm月，dd日: ");

	int year = sc.nextInt();
	int month = sc.nextInt();
	int day = sc.nextInt();		
	int dayCount = 0;
	
    // 正確閏年判斷
    boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    int[] days = isLeap
            ? new int[]{31,29,31,30,31,30,31,31,30,31,30,31}
            : new int[]{31,28,31,30,31,30,31,31,30,31,30,31};

    // 驗證月份
    while (month < 1 || month > 12) {
        System.out.println("月份錯誤，請重新輸入 mm：");
        month = sc.nextInt();
    }

    // 驗證日期
    while (day < 1 || day > days[month - 1]) {
        System.out.println("日期錯誤，請重新輸入 dd：");
        day = sc.nextInt();
    }


    // 加總前幾月
    for (int i = 0; i < month - 1; i++) {
        dayCount += days[i];
    }

    // 加上當月
    dayCount += day;

    System.out.println("輸入的日期為該年第 " + dayCount + " 天");
    
    sc.close();
}
}