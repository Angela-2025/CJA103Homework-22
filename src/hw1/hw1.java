package hw1;

public class hw1 {
	public static void main(String[] arg) {
        sum();
        egg();
        day();
        circle();
        money();
        sp();
    }

//	• 請設計一隻Java程式,計算12,6這兩個數值的和與積

	public static void sum() {
	int a = 6,b = 12;
	System.out.println("和：" + (a + b));
	System.out.println("積："+ (a * b));
	}
	
//	• 請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
	public static void egg() {	
	int egg = 200,d = 12;
	int dozen = egg / d;
	int reminder = egg % d;
	System.out.println("蛋共是" + dozen + "打" + reminder + "顆");
	}
	
//	• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒	
	public static void day() {
	int totalseconds = 256559;
	int days = totalseconds / (60 * 60 * 24);

	int remainder = totalseconds % (24 * 3600);
	
	int hours = remainder / 3600;
	remainder = remainder % 3600;
	int minutes = remainder / 60;
	int seconds = remainder % 60;
	System.out.println(days + "天" + hours +"小時" + minutes +"分" + seconds + "秒");		
	}
	
//	• 請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長(要用公式)	
	public static void circle() {
	final double PI = 3.1415;
	int radius = 5;
	double circumference = 2 * radius * PI;
	double area = PI * radius * radius;
	System.out.println("圓周長: " + circumference);
    System.out.println("圓面積: " + area);
	}
	
//	• 某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢 (用複利計算,公式請自行google)	
	public static void money() {	
	double money = 1500000;
	double rate = 0.02;
	int years = 10;
	double amount = money * Math.pow(1 + rate, years);
	System.out.printf("10年後本金加利息共有: %.2f 元\n", amount);
	}

//	• 請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//	5 + 5
//	5 + ‘5’
//	5 + “5”
//	並請用註解各別說明答案的產生原因    各別為何答案不同	
	
	public static void sp() {
	System.out.println(5 + 5);	
    //因為println括號裡面等同運算5+5，等於10
	

	System.out.println(5 + '5');
//	前面的是數字5後面是字元'5' ，
//  字元'5'，代表Unicode碼中數值為53（十進位）
//	所以這行程式碼是整數5加上數值53，結果為 58

	System.out.println(5 + "5");
//	前面的是數字5後面是字串5：整數 + 字串
//  Java會把數字轉成字串做字串串接,"5" + "5" = "55"
	}
}
	