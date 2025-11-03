package hw2;

public class hw2 {
	  public static void main(String[] args) {	
		  thousandsum();
		  ten1();
		  ten2();
		  Square();
		  lotto();
		  pyramid1();
		  pyramid2();
	  }  
//• 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
	    public static void thousandsum() {	
		int sum = 0;
		for (int i = 2; i <= 1000; i += 2) {
			sum += i;
		}
		System.out.println("1~1000 的偶數總和是：" + sum);		
	    }
       
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
        public static void ten1() {	
    	int product = 1;
    	for (int a = 1; a <= 10; a++) {
    		product *= a;
        }
        System.out.println("1~10的連乘積是：" + product);		
        }
        
//• 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
        public static void ten2() {	
    	int product = 1;
        int b = 1;
    	while ( b <= 10 ) {
    		product *= b;
    		b++;
    	    }
        System.out.println("1~10的連乘積是：" + product);		
        }
        
/*• 請設計一隻Java程式,輸出結果為以下:
    1 4 9 16 25 36 49 64 81 100 */
        public static void Square() {
        	int c = 1;
            while (c <= 10 ) {
            System.out.print((c * c) + " ");
            c++;          
            }
            System.out.println(); 
        }
        
/*• 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。
    請設計一隻程式,輸出結果為阿文可以選擇的數字有哪些?總共有幾個?*/
        public static void lotto() {
        	int count = 0;
        	for (int d = 1 ; d <= 49 ; d++ )
        		if(d / 10 != 4 && d % 10 != 4) {
        		System.out.print( d + " ");
        			count++;
        		}       	
        	System.out.println("\n阿文可以選擇的數字總共有：" + count + " 個");
            }       

//• 請設計一隻Java程式,輸出結果為以下:
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
		public static void pyramid1() {
			int count = 10;
			for (int i = 10; i >= 1; i--) {     // 從 10 倒數到 1
			for (int j = 1; j <= i; j++) {      // 每行從 1 印到 i
            System.out.print(j + " ");
            }
            System.out.println();  
			}
			}

//• 請設計一隻Java程式,輸出結果為以下:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
		public static void pyramid2() {
			for (int i = 0; i < 6; i++) { 
				char ch = (char) ('A' + i);
			for (int j = 0; j <= i; j++) {      
            System.out.print(ch);
            }
            System.out.println();  
			}
		}
	}
