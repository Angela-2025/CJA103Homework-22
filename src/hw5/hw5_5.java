package hw5;
/*身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法
genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
與數字的亂數組合,如圖:*/

public class hw5_5 {
	
	public void genAuthCode() {
		String aCode = "";
		
		for (int i = 0 ; i < 8; i ++) {
			int condition = (int)(Math.random() * 3);
			
			switch (condition) {
			case 0:
				int upper = (int)(Math.random() * 26) + 65;
				aCode += (char) upper;
				break;
				
			case 1:
				int lower = (int)(Math.random() * 26) + 97;
				aCode += (char) lower;
				break;
			
			case 2:
				int num = (int)(Math.random() * 10);
				aCode += (char)(num + '0');
				break;			
			}
		}
		System.out.println(aCode);
	}
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為：");
		hw5_5 w = new hw5_5();
		w.genAuthCode();
	}
}
