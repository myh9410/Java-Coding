package maven;

import java.util.Scanner;

public class ganji {
	public static void main(String[] args) {
		String[][] ganji = {
				{"A","B","C","D","E","F","G","H","I","J"},
				{"a","b","c","d","e","f","g","h","i","j","k","l"},
		};
		Scanner sc = new Scanner(System.in);
		int year = Integer.parseInt(sc.nextLine());
		int day = year;
		day = day-1;
		int k = 0;
		int t = 0;
		int v = 0;
		int p = 0;
		k = day*365+(day/4-(day/100)+(day/400));
		p = k%7;
		String result = "";
		for (int i = 4;i<64; i++){
			t = (i-4)%10;
			v = (i-4)%12;
			if (year%60 == i%60){
				result = ganji[0][t]+ganji[1][v];
			}
		}
		if (p == 1) 
			System.out.println(result + " Tuesday");
		else if (p==2)
			System.out.println(result + " Wednesday");
		else if (p==3) 
			System.out.println(result + " Thursday");
		else if (p==4)
			System.out.println(result + " Friday");
		else if (p==5)
			System.out.println(result + " Saturday");
		else if (p==6)
			System.out.println(result + " Sunday");
		else
			System.out.println(result + " Monday");
	}
}
