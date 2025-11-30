package hw5;

//請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值

public class hw5_2 {

    public static void randAvg() {
        double sum = 0;
        int randInt;

        System.out.println("本次亂數結果：");

        for (int i = 0; i < 10; i++) {
            randInt = (int) (Math.random() * 101);
            System.out.print(randInt + " ");
            sum += randInt;
        }

    double avg = sum / 10;
	System.out.println("\n平均值：" + avg);

	}	

	public static void main(String[] args) {
		randAvg();
	}
	
}