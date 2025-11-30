package hw4;

/*
 * 有個字串陣列如下 (八大行星):
{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
*/
public class hw4_3 {
	
	public static void main(String[] args) {
		
		String[] planets = {
			    "mercury","venus","earth","mars",
			    "jupiter","saturn","uranus","neptune"
			};

			int count = 0;
			String vowels = "aeiou";

			for (String p : planets) {
			    for (char c : p.toCharArray()) {
			        if (vowels.indexOf(c) >= 0) count++;
			    }
			}

			System.out.println(count);

	}

}
