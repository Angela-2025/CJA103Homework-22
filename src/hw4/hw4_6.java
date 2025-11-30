package hw4;
/*
 班上有8位同學,他們進行了6次考試結果如下:
 請算出每位同學考最高分的次數
 */
public class hw4_6 {

	public static void main(String[] args) {
	int[][] scoreByQuiz = {{10,35,40,100,90,85,75,70},{37,75,77,89,64,75,70,95},{100,70,79,90,75,70,79,90},{77,95,70,89,60,75,85,89},{98,70,89,90,75,90,89,90},{90,80,100,75,50,20,99,75}};
	int[] highestScoreCount = {0,0,0,0,0,0,0,0};
	int maxScore;
	
	for(int i = 0; i < scoreByQuiz.length; i++) {
		maxScore = scoreByQuiz[i][0];
		for(int j = 1; j < scoreByQuiz[i].length; j++) {
			if(scoreByQuiz[i][j] > maxScore) {
				maxScore = scoreByQuiz[i][j];
			}		
		}
		for (int j = 0; j < scoreByQuiz[i].length; j++) {
			if(maxScore == scoreByQuiz[i][j]) {
				highestScoreCount[j] += 1;
			}
		}
	}
	
	for(int i = 0; i < highestScoreCount.length; i++) {
		System.out.println((i+1) + " 號同學考最高分的次數為 " + highestScoreCount[i] + " 次");
	}
}		
}
