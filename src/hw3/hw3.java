package hw3;

import java.util.Scanner;

public class hw3 {

    public static void main(String[] args) {
        triangle(); // 題目一：三角形種類
        guess();    // 題目二：猜數字遊戲
        lotto();    // 題目三：樂透
        randomDemo();//題目四：亂數
        ScannerDemo();//題目五：Scanner
    }

   /* 題目一：請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰三角形、其它三角形或不是三角形,
   如圖示結果:*/ 
    public static void triangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入三個整數：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 先判斷是否為三角形
        if (a + b > c && a + c > b && b + c > a) {
            // 用邏輯分類
            if (a == b && b == c) {
                System.out.println("正三角形");
            } else if (a == b || b == c || a == c) {
                System.out.println("等腰三角形");
            } 
            // 進階功能：直角三角形判斷
            else if (a * a + b * b == c * c ||
                     a * a + c * c == b * b ||
                     b * b + c * c == a * a) {
                System.out.println("直角三角形");
            } else {
                System.out.println("其它三角形");
            }
        } else {
            System.out.println("不是三角形");
        }
        System.out.println();

    }
    //題目二：請設計一隻程式,會亂數產生一個0~9的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜對則顯示正確訊息,如圖示結果:
    public static void guess() {
        Scanner sc = new Scanner(System.in);
        int answer = (int)(Math.random() * 10); // 0~9亂數
        int guess;

        System.out.println("開始猜數字，數字範圍：0～9");

        while (true) {             
            guess = sc.nextInt();   // 無限迴圈會讓使用者一直猜，直到猜中為止

            if (guess == answer) {
                System.out.println("答對了！答案就是" + answer);
                break;
            } else {
                System.out.println("猜錯囉");    
                
//                if (guess > answer) {    //增加猜測提示
//                    System.out.println("太大了！");
//                } else if (guess < answer) {
//                    System.out.println("太小了！");
//                } else {
//                    System.out.println("答對了！答案就是：" + answer);
//                    break;
//                }                
                
            }
        }
        System.out.println();
    }
    /*題目三：阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
    厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
    的號碼與總數,如圖:*/
    public static void lotto() {
            Scanner sc = new Scanner(System.in);
            System.out.print("阿文...請輸入你討厭哪個數字(1~9)? ");
            int dislike = sc.nextInt();

            int count = 0; // 計算剩下的數字有幾個

            // 1~49逐一檢查
            for (int i = 1; i <= 49; i++) {
                // 若數字中包含"討厭的數字"就跳過
                if (String.valueOf(i).contains(String.valueOf(dislike))) {
                    continue;
                }

                // 顯示可選號碼
                System.out.printf("%2d ", i);   //"%2d " 代表「印出一個整數（d）佔 2 個字元寬度
                count++;

                // 每 5 個換一行
                if (count % 5 == 0) {
                    System.out.println();
                }
            }

            // 顯示總數
            System.out.println("\n總共有 " + count + " 個數字可以選！");
            System.out.println();
           
        }
    //題目四：透過Math類別的靜態方法random(),可以自動產生隨機的數字
    public static void randomDemo() {
        int num1 = (int)(Math.random() * 10) + 1;  // 1~10
        int num2 = (int)(Math.random() * 31) + 20; // 20~50

        System.out.println("亂數1: " + num1);
        System.out.println("亂數2: " + num2);
        System.out.println();
    }
    //題目五：Scanner紅底字請移動滑鼠到錯誤處,點選Import ‘Scanner’即可
    public static void ScannerDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入整數或小數：");

        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println("你輸入的整數是：" + i);
        } else if (sc.hasNextDouble()) {
            double d = sc.nextDouble();
            System.out.println("你輸入的小數是：" + d);
        } else {
            System.out.println("輸入格式錯誤！");
        }
        sc.close();
    }
}