package maven;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IOI {
	public static void main(String[] args) {	
	String p = "";
	System.out.println("케이스의 수(T) : ");
	Scanner sc1 = new Scanner(System.in);
	int T = Integer.parseInt(sc1.nextLine());
	for (int i =0; i<T; i++){
			System.out.println("P의 갯수(N)");
			Scanner sc2 = new Scanner(System.in);
			int N = Integer.parseInt(sc2.nextLine());
			System.out.println("S의 길이(M)");
			Scanner sc3 = new Scanner(System.in);
			int M = Integer.parseInt(sc3.nextLine());
			System.out.println("문자열 S");
			Scanner sc4 = new Scanner(System.in);
			String S = sc4.nextLine();
			String oi = "OI";
			int repeat = N-1;
			String target = multiConcat(oi,repeat);
			String reg = S;
			Pattern pat = Pattern.compile(reg);
			Matcher match = pat.matcher(target);
			int count = 0;
			while (match.find()){
				count += 1;
				System.out.println(count);		
			}
		}
	}
	

	private static String multiConcat(String oi, int repeat) {
		String s = "";
		for (int i=0; i< repeat; i++){
			s = s+oi;
		}
		String t = "IOI"+s;
		return t;
	}
}
