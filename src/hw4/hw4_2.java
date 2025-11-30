package hw4;

/*
請建立一個字串,經過程式執行後,輸入結果是反過來的
例如String s = “Hello World”,執行結果即為dlroW olleH
(提示:String方法,陣列)             */

public class hw4_2 {
	public static void main(String[] args) {   //StringBuilder（Java 內建類別）
		String s = "Hello world!";
		System.out.println(reverseString(s));  //呼叫反轉
	}

	public static String reverseString(String s) {
		char reversedChar[] = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			reversedChar[i] = s.charAt(s.length() - i - 1);
		}
		String reversedString = new String(reversedChar);
		return reversedString;
	}
}
